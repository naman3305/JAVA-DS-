import java.util.*;
class liner_search      
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=s.nextInt();
        int i;
        int index=-1;
        
    int ar[]=new int[n];
    System.out.println("Enter the element of the array");
    for(i=0;i<n;i++)
    {
        ar[i]=s.nextInt();
    }
    System.out.println("Enter the element to be searched");
        int element=s.nextInt();
         for(i=0;i<n;i++)
    {
        if(ar[i]==element)
        {
            index=i; 
        }
    }
    if(index==-1)
    {
        System.out.println("Element "+element+" Not found in the array");
    }
    else{
        System.out.println("Element "+element+ " is found at index "+index);
    }
    }
}
