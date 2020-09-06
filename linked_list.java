import java.util.*;

public class linked_list{
    
  Node head;
  
  class Node
{
    int data;
    Node next;
     
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
    
 public void insert(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    
    
    public void insertStart(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    
    
    public void insertAtIndex(int index,int data)
    {
        Node node=new Node(data);
        int count=1;
        Node c=head;
        while(c.next!=null)
        {
            count++;
            c=c.next;
        }
        if(index>=0 && index<=count)
        {
        if(index==0)
        {
            insertStart(data);
        }
        else
        {
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            
            node.next=temp.next;
            temp.next=node;
        }
        }
        else
        {
            System.out.println("IndexOutOfBoundsException");
        }
    }
    
    
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n1=null;
            Node temp=head;
            
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            n1=temp.next;
            temp.next=n1.next;
            System.out.println("deleted item is "+n1.data);
        }
    }
    

    public  void show()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
     public static void main(String []args){
      
      linked_list ob=new linked_list();
       ob.insert(10);
       ob.insert(20);
       ob.insert(30);
       
       
      // ob.insertStart(40);
     //  ob.insertStart(50);
     
     
     ob.insertAtIndex(3,60);
     
  //   ob.deleteAt(2);
       ob.show();
     }
}
