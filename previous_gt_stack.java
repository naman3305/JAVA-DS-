import java.util.*;

class previous_gt_stack
{ 
static void prevGreater(int arr[],int n) 
{ 
    Stack2 s = new Stack2(); 
    s.push(arr[0]); 
    System.out.print("-1, "); //first element is always -1.
    
    for (int i = 1; i < n; i++)  
    { 
        while (s.empty() == false &&  s.peek() < arr[i])//if element at top is smaller than next element  
            s.pop();                        //pop it till we find a grater element and if stack bracomes
                                            //empty we will print -1.
        if (s.empty() == true)  
            System.out.print("-1, "); 
        else
            System.out.print(s.peek() + ", "); 
  
        s.push(arr[i]); 
    } 
} 
public static void main(String[] args) 
{ 
    int arr[] = { 10, 4, 2, 20, 40, 12, 30 }; 
    int n = arr.length; 
    prevGreater(arr, n); 
} 
} 
class Stack2
{
  static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; 
  
    boolean empty() 
    { 
        return (top < 0); 
    } 
    Stack2() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            return true; 
        } 
    } 
  
    int pop() 
    { 
       
            int x = a[top--]; 
            return x; 
    } 
  
    int peek() 
    { 
            int x = a[top]; 
            return x; 
    }    
}

