import java.util.*;

public class middle_LinkedList {
    class Node{
    Node next;
    int data;
    Node(int d)
    {
        data=d;
    }
}
    Node head,tail;
    void add(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=tail=n;
        }
        else
        {
        tail.next=n;
        tail=n;
        }
    }
    void printMiddle(Node head)
    {
        if(head==null)
        {
            return ;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
            
    }
    public void display()
    {
        printMiddle(head);
    }
    public static void main(String args[])
    {
       middle_LinkedList ml=new middle_LinkedList();
       ml.add(10);
       ml.add(20);
       ml.add(30);
       ml.add(40);
       ml.add(50);
       ml.display();
    }
}
