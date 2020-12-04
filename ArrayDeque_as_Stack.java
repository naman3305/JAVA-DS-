import java.util.*;

public class ArrayDeque_as_Stack
{
      public static void main(String args[])
      {
       ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
       ad.push(10);
       ad.push(20);
       System.out.println(ad.peek());
       System.out.println(ad.pop());
       System.out.println(ad.peek());
       System.out.println(ad.poll());//pop throw error in empty queue.
       ad.push(40);
       System.out.println(ad.peek());
      }  
}
