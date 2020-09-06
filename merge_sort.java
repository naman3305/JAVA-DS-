import java.util.*;
class merge_sort{
    
static void ms(int a[],int lb,int ub)
{
    int mid=0;
    if(lb<ub)
    {
        mid=(lb+ub)/2;
        ms(a,lb,mid);
        ms(a,mid+1,ub);
        merge(a,lb,mid,ub);
    }
}
static void merge(int a[],int lb,int mid,int ub)
{
    int i,j,k;
    i=lb;
    j=mid+1;
    k=lb;
    int b[]=new int[100];
    while(i<=mid&&j<=ub)
    {
        if(a[i]<a[j])
        {
            b[k]=a[i];
            i++;
        }
        else
        {
            b[k]=a[j];
            j++;
        }
        k++;
    }
    if(i>mid)
    {
        while(j<=ub)
        {
            b[k]=a[j];
            j++;
            k++;
        }
    }
    else
    {
        while(i<=mid)
        {
            b[k]=a[i];
            i++;
            k++;
        }
    }
    for(k=lb;k<=ub;k++)
    {
        a[k]=b[k];
    }
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Array");
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    ms(a,0,n-1);
    System.out.println("Array after merge sort is:");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
}

}


