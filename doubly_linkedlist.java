import java.util.*;

public class doubly_linkedlist
{
     class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail; 
            tail = newNode;  
            tail.next = null;  
        }  
    }
    
  public void addNodeStart(int data)
  {
      Node newNode = new  Node(data);
      if(head == null)
      {
          head = tail = newNode;
          head.previous = null;
          tail.next = null;
      }
      else
      {
    head.previous = newNode;
    newNode.next = head;
    newNode.previous = null;
    head = newNode;
      }
  }
      public void addNodeAtIndex(int data,int index)
      {
          Node newNode=new Node(data);
          if(head == null)
          {
          head = tail = newNode;
          head.previous = null;
          tail.next = null;
          }
          else
          {
              Node temp=head;
              for(int i=0;i<index-1;i++)
              {
                  temp=temp.next;
              }
              
              newNode.next=temp.next;
              temp.next=newNode;
              newNode.previous=temp;
           
          }
          
  }
  
  public void deleteAtEnd()
  {
        if(head==null)
        {
            System.out.println("The list is already empty");
        }
        else
        {
            tail=tail.previous;
            tail.next=null;
        }
  }
  
  public void deleteAtStart()
  {
        if(head==null)
        {
            System.out.println("The list is already empty");
        }
        else
        {
           head=head.next;
           head.previous=null;
        }
  }
  
/*  public void delteAtIndex(int n)
  {
      int count=0;
      Node current=head;
      while(current!=null)
      {
          count++;
          current=current.next;
      }
      if(n==0)
      {
          deleteAtStart();
      }
      else if(n==count)
      {
          deleteAtEnd();
      }
      else
      {
          if(n>count)
          {
              System.out.println("IndexOutOfBoundsException");
          }
          else
          {
              Node temp=head;
              Node n1=null;
              
              for(int i=0;i<n-1;i++)
              {
                  temp=temp.next;
              }
              n1.tail=temp.next;
              
          }
      }
  }*/
  
    public void display() { 
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        doubly_linkedlist dList = new  doubly_linkedlist();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
        
        dList.addNodeStart(0);
        
        dList.addNodeAtIndex(10,4);
        dList.addNodeAtIndex(11,6);
        
        dList.deleteAtEnd();
        
        dList.deleteAtStart();
        
        dList.display(); 
    }  
}



