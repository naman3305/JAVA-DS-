import java.util.*;
public class queue_circulararray {
   int ar[];
   int front,cap,size,rear;
  queue_circulararray(int c)
   {
      ar=new int[c];
      cap=c;
      front=0;
      size=0;
   }
   boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }
  int getFront()
  {
      if(isEmpty())
      return -1;
      else
          return front;
  }
  int getRear()
  {
      if(isEmpty())
          return -1;
      else
          return(front+size-1)%cap;
  }
  void enque(int x)
  {
      if(isFull())
      {
          return ;
      }
      else
      {
          int rear=getRear();
          rear=(rear+1)%cap;//this give index is queue is filled from last and empty from begining it emter element in start
         ar[rear]=x;
          size++;
      }
  }
  void deque()
  {
      if(isEmpty())
          return ;
      else
          front=(front+1)%cap;
      size--;
  }
  void print(queue_circulararray q)
  {
        if(front == -1) 
    { 
        System.out.print("Queue is Empty"); 
        return; 
    } 
    System.out.print("Elements in the " + 
                     "circular queue are: "); 
  
    if(rear >= front) 
    { 
 
        for(int i = front; i <= rear; i++) 
        { 
            System.out.print(ar[i]); 
            System.out.print(" "); 
        } 
        System.out.println(); 
    } 

    else
    { 

        for(int i = front; i < cap; i++) 
        { 
            System.out.print(ar[i]); 
            System.out.print(" "); 
        } 
        for(int i = 0; i <= rear; i++) 
        { 
            System.out.print(ar[i]); 
            System.out.print(" "); 
        } 
        System.out.println(); 
    } 
  }
   public static void main(String args[])
    {
       queue_circulararray q=new queue_circulararray(4);//we have used circular array of size 4
        q.enque(10);//array is 10  front is 10 
        q.enque(20);//array is 10 20
        q.enque(30);//array is 10 20 30   
        q.enque(40);//array is 10 20 30 40 and rear is 40
        q.deque();//10 is removed and front is shifted to 20
        q.deque();//20 is removed and front is shifted to 30
        q.enque(50);//array is 50 - 30 40 front is 30 and rear is 50
        q.print(q);
    }
}
