import java.util.*;

class binary_search { 
   static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid;
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        }
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
          Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=s.nextInt();
        int arr[] =new int[n];
         System.out.println("Enter the element of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    System.out.println("Enter the element to be searched");
        int x=s.nextInt();
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
