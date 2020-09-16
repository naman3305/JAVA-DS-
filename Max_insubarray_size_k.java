import java.util.LinkedList;
import java.util.*;
public class Max_insubarray_size_k {
    void printKMax(int arr[],int k)//we made a queue of size k and logic is we will take k elements at a time and will find max out of it
    {                               //i queue we are storing indexes only
        int n=arr.length;
        Deque<Integer> dq=new LinkedList<Integer>();
        for(int i=0;i<k;i++)//for first queue of size k
        {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])//check if queue is not empty and elemets in it are lesser than elemetn we are insertng
                dq.removeLast();//if true we will remove all leser elements 
            dq.addLast(i);//inserting element in queue. and element at start of array will be max.
        }
        for(int i=k;i<n;i++)//after first k elements we need to check every next element as we need to check all subarrays of size k
        {
            System.out.print(arr[dq.peek()]+" ");//print max queue as we have amx at front after each loop
            while(!dq.isEmpty() && dq.peek()<=i-k)//we are removing index which is not used for next subarray eg index 0 is not used in next subarray so we remove it
                dq.removeFirst();
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
          System.out.print(arr[dq.peek()]+" ");
    }
    public static void main(String args[])
    {
        int arr[]={10,8,5,12,15,7,6};//we want to get max in subarrays of size k in an array
        Max_insubarray_size_k m=new Max_insubarray_size_k();
        m.printKMax(arr,3);//we will have n-k+1 output n is size of array
    }
}
