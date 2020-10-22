import java.io.*;
import java.util.*;
import java.util.Scanner.*;


public  class ll{
    class Node{
        
        Node next;
        int data;
    }
    
     Node head;

    public ll() {
        head = null;
    }

    public  void addNode(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null)
        {
            node.next=null;
            head=node;
        }
        else{
        Node temp=head;
        node.next=temp;
        head=node;
        }
    }

    public void deleteNode(int number)
    {
        Node temp=head;
        Node prevNode=temp;
        Node nextNode;
        while(temp!=null)
        {
            if(temp.data==number)
            {
                if(temp==head)
                {
                    head=temp.next;
                }
                int num=temp.data;
                nextNode=temp.next;
                prevNode.next=nextNode;
                System.out.println("deleted element is "+num);
                return;
            }

            prevNode=temp;
            temp=temp.next;
        }
    }

    public void printList()
    {
        Node temp=head; 
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        ll list=new ll();
        list.addNode(5);
        list .addNode(6);
        list.deleteNode(6);
        list.printList();
    }
}
