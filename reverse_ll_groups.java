import java.util.*; 

class LinkedList 
{ 
    Node head;  
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        {
            data = d; 
            next = null; 
        } 
    } 
  
    Node reverse(Node head, int k) 
    { 
       Node curr = head; 
       Node next = null; 
       Node prev = null; 
         
       int count = 0; 
  
       /* Reverse first k nodes of linked list */
       while (count < k && curr != null)  
       { 
           next = curr.next; 
           curr.next = prev; 
           prev = curr; 
           curr = next; 
           count++; 
       } 
  
       /* next is now a pointer to (k+1)th node  
          Recursively call for the list starting from current. 
          And make rest of the list as next of first node */
       if (next != null)  
          head.next = reverse(next, k); 
  
       // prev is now head of input list 
       return prev; 
    }                       
  
    public void insert(int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
}
class reverse_ll_groups{
    public static void main(String args[]) 
    { 
        LinkedList list = new LinkedList(); 
        
        list.insert(9); 
        list.insert(8); 
        list.insert(7); 
        list.insert(6); 
        list.insert(5); 
        list.insert(4); 
        list.insert(3); 
        list.insert(2); 
        list.insert(1); 
          
        System.out.println("Given Linked List"); 
        list.printList(); 
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the size of group");
          int k=sc.nextInt();
        list.head = list.reverse(list.head, k); 
  
        System.out.println("Reversed list"); 
        list.printList(); 
    } 
}  
