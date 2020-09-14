import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class queue_ll {
      Node front,rear,head;
      queue_ll()
      {
          front=rear=null;
      }
      void enque(int x)
      {
          Node temp=new Node(x);
          if(front==null)
          {
              front=rear=temp;
              return ;
          }
          rear.next=temp;
          rear=temp;
      }
      void deque()
      {
          if(front==null)
          {
              rear=null;
              return ;
          }
          front=front.next;
      }
      void print(queue_ll q)
      {
          head=front;
          while(front!=rear.next)
          {
              System.out.print(front.data+" ");
              front=front.next;
          }
          System.out.println();
          front=head;
      }
      public static void main(String args[])
      {
       queue_ll q=new queue_ll();
       q.enque(10);
       q.enque(20);
       q.enque(30);
       q.enque(40);
       q.print(q);
       q.deque();
       q.print(q);
      }
}
