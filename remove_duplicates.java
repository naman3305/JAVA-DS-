import java.util.*;

public class remove_duplicates{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter a sorted array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int nu=removeduplicate(arr,n);
        System.out.println("Sorted array is:");
        for(int i=0;i<nu;i++)
        System.out.print(arr[i]+" ");
    }
    static int removeduplicate(int arr[],int n)
    {
        int res=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[res-1])//if in sorted array previous element is not equal to next element
            {                     //in array there will be no change but if it is equal res will remain at last
                arr[res]=arr[i];//place but i will increment till greater element is found.
                res++;         
            }
        }
        return res;//res will be the new size of sorted array will no duplicates. 
    }
}
