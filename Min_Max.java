import java.util.LinkedList;
import java.util.*;

public class Min_Max {
 Deque<Integer> dq;
Min_Max()
{
    dq=new LinkedList<Integer>();
}
 void insertMin(int x)
{
    dq.offerFirst(x);
}
 void insertMax(int x)
{
    dq.offerLast(x);
}
 int getMin()
{
    return dq.peekFirst();
}
 int getMax()
{
    return dq.peekLast();
}
 int extractFirst()
{
    return dq.pollFirst();
}
 int extractLast()
{
    return dq.pollLast();
}
public static void main(String args[])
{
    Min_Max mm=new Min_Max();
    mm.insertMin(5);
    mm.insertMax(10);
    mm.insertMin(3);
    mm.insertMax(15);
    mm.insertMin(2);
   System.out.println(mm.getMin());
    System.out.println(mm.getMax());
    mm.insertMin(1);
    System.out.println(mm.getMin());
    mm.insertMax(20);
    System.out.println(mm.getMax());
}
}
