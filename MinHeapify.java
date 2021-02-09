import java.util.*;

public class MinHeapify
{
    int arr[];
    int size,capacity;
    public MinHeapify(int maxsize) 
    { 
        this.capacity = maxsize; 
        this.size = 0; 
        arr = new int[this.capacity + 1]; 
        arr[0] = Integer.MIN_VALUE; 
    } 
    void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = arr[fpos]; 
        arr[fpos] = arr[spos]; 
        arr[spos] = tmp; 
    } 
     private int parent(int pos) 
    { 
        return pos / 2; 
    } 
    private int left(int pos) 
    { 
        return (2 * pos); 
    } 
    private int right(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
    void minHeapify(int i)
    {
        int lt=left(i),rt=right(i);
        int smallest=i;
        if(lt<size && arr[lt]<arr[i])
            smallest=lt;
     if(rt<size && arr[rt]<arr[smallest])
            smallest=rt;
     if(smallest!=i)
     {
         swap(arr[i],arr[smallest]);
         minHeapify(smallest);
     }
    }
     public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + arr[i] 
                             + " LEFT CHILD : " + arr[2 * i] 
                             + " RIGHT CHILD :" + arr[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
      public void insert(int element) 
    { 
        if (size >= capacity) { 
            return; 
        } 
        arr[++size] = element; 
        int current = size; 
  
        while (arr[current] < arr[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
    public static void main(String args[])
    {
          System.out.println("The Min Heap is "); 
        MinHeapify heapify = new MinHeapify(15); 
        heapify.insert(5); 
        heapify.insert(3); 
        heapify.insert(17); 
        heapify.insert(10); 
        heapify.insert(84); 
        heapify.insert(19); 
        heapify.insert(6); 
        heapify.insert(22); 
        heapify.insert(9); 
        heapify.minHeapify(0);
  
        heapify.print(); 
    }
}
