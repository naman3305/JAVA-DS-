import java.util.*;

public class ExtractMin {
     int Heap[];
    int size,capacity;
    public ExtractMin(int maxsize) 
    { 
        this.capacity = maxsize; 
        this.size = 0; 
        Heap = new int[this.capacity + 1]; 
        Heap[0] = Integer.MIN_VALUE; 
    } 
    int exctractMin()
    {
    if(size==0)
    return Integer.MAX_VALUE;
    
    if(size==1)
    {
        size--;
        return Heap[0];
    }
    swap(Heap[0],Heap[size-1]);
    size--;
    minHeapify(0);
    return Heap[size];
    }
     private int parent(int pos) 
    { 
        return pos / 2; 
    } 
  
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
  
  
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
  
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
     private void minHeapify(int pos) 
    { 
  
        // If the node is a non-leaf node and greater 
        // than any of its child 
        if (!isLeaf(pos)) { 
            if (Heap[pos] > Heap[leftChild(pos)] 
                || Heap[pos] > Heap[rightChild(pos)]) { 
  
                // Swap with the left child and heapify 
                // the left child 
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) { 
                    swap(pos, leftChild(pos)); 
                    minHeapify(leftChild(pos)); 
                } 
  
                // Swap with the right child and heapify 
                // the right child 
                else { 
                    swap(pos, rightChild(pos)); 
                    minHeapify(rightChild(pos)); 
                } 
            } 
        } 
    } 
      public void insert(int element) 
    { 
        if (size >= capacity) { 
            return; 
        } 
        Heap[++size] = element; 
        int current = size; 
  
        while (Heap[current] < Heap[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
  
    // Function to print the contents of the heap 
    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Heap[i] 
                             + " LEFT CHILD : " + Heap[2 * i] 
                             + " RIGHT CHILD :" + Heap[2 * i + 1]); 
            System.out.println(); 
        } 
    }
      private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
    public static void main(String[] arg) 
    { 
        System.out.println("The Min Heap is "); 
        ExtractMin minHeap = new ExtractMin(15); 
        minHeap.insert(5); 
        minHeap.insert(3); 
        minHeap.insert(17); 
        minHeap.insert(10); 
        minHeap.insert(84); 
        minHeap.insert(19); 
        minHeap.insert(6); 
        minHeap.insert(22); 
        minHeap.insert(9); 
        minHeap.exctractMin(); 
  
        minHeap.print(); 
    
    } 
}
