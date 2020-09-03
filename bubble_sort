import java.util.*;

public class Main {  
    static void bubbleSort(int[] arr)
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                           }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args)
    {  
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Array Size");
            int n=s.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter Array");
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
                 
                  
                bubbleSort(arr);  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
} 

