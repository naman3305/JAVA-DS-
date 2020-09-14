import java.util.*;
public class queue_arraydequeue {
    public static void main(String args[])
    {
        Queue<Integer> q=new ArrayDeque<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.size());
        System.out.println(q.peek());//print element in front
        System.out.println(q.poll());//remove element in front and dont throw erroe if empty whereas remove throw error if empty
        System.out.println(q.isEmpty());
        System.out.println(q);//print the queue
    }//get(),element(),add(),remove() these also can be used
}
