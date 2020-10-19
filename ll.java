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
        list.printList();
        


    }
}
