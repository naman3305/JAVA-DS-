import java.util.*;
public class queue {
    int size,cap;
    int arr[];
    queue(int c)
    {
        cap=c;
        size=0;
        arr=new int[cap];
    }
    boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }
    void enqueue(int x)
    {
        if(isFull())
        {
            return ;
        }
        arr[size]=x;
        size++;
    }
    void dequeue()
    {
        if(isEmpty())
        {
            return ;
        }
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
    }
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
            return arr[0];     
    }
    int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
            return arr[size-1];
    }
    public static void main(String args[])
    {
       queue q=new queue(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.dequeue();
    }
}