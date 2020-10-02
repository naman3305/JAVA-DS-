import java.util.Stack;

public class previousGreater_stack {
    void printGreater(int arr[],int n)
    {
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            while(s.empty()==false && s.peek()<=arr[i])
                s.pop();
            
                int pg=(s.empty())?-1:s.peek();
                System.out.print(pg+" ");
                s.push(arr[i]);
        }
    }
    public static void main(String args[])
    {
        previousGreater_stack pg=new previousGreater_stack();
        int arr[]={20,30,10,5,15};
        pg.printGreater(arr,arr.length);
    }
}
