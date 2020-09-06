import java.util.*;

public class  revese_doubly_linkedlist
{
	
		 class Node
		 {  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data)
        {  
            this.data = data;  
        }  
		 }
		 
          Node head, tail = null;  
  
  
    public void addNode(int data) 
    {  
        Node newNode = new Node(data);  
        if(head == null)
        {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else
        {  
            tail.next = newNode;  
            newNode.previous = tail; 
            tail = newNode;  
            tail.next = null;  
        }  
    }
     void reverse() { 
        Node temp = null; 
        Node current = head; 
  
       
        while (current != null) { 
            temp = current.previous; 
            current.previous = current.next; 
            current.next = temp; 
            current = current.previous; 
        } 
  
        if (temp != null) { 
            head = temp.previous; 
        } 
    } 
    
      public void display()
      { 
        Node current = head;  
        if(head == null)
        {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Doubly linked list: ");  
        while(current != null) 
        {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();
    }  
    
    
    public static void main(String[] args) {
         revese_doubly_linkedlist dList = new  revese_doubly_linkedlist();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
        dList.display();
        dList.reverse();
        dList.display();
	}
}

