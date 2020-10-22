
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class doubleLinkedList {



    public static void main(String[] args)
    {
        doubleList dl=new doubleList();
        dl.addEnd(5);
        dl.addEnd(6);
        dl.addEnd(7);
        dl.deleteNode(7);
        dl.printList();

    }
    
}

class doubleList
{
    class Node{
        Node next;
        int data;
        Node prev;
    }
Node head,tail;
    doubleList()
    {
        head=null;
    }

    public void addEnd(int data)
    {   Node cur=tail;
        Node node=new Node();
        node.data=data;
        if(head==null)
        {
            head=tail=node;
            head.next=head.prev=null;
            return;
        }
        cur.next=node;
        node.prev=cur;
        node.next=null;
        tail=node;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void deleteNode(int data)
    {
        Node temp=head;
        Node prevnode,nextNode;
        while(temp!=null){
        if(temp.data==data)
        {
            if(temp==head){
            head=temp.next;
            head.prev=null;
            return;
            }


            prevnode=temp.prev;
            nextNode=temp.next;
            prevnode.next=nextNode;
            if(temp.next==null)
            return;
            
            nextNode.prev=prevnode;
            return;
    
        }
        temp=temp.next;
    }
    }


}
