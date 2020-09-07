import java.util.*;

class Stack1
{ 
    int size; 
    int top; 
    char[] a;  
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
      
    Stack1(int n) 
    { 
        top = -1; 
        size = n; 
        a = new char[size]; 
    } 
 
    void push(char x) 
    { 
        if (top >= size) 
        { 
        System.out.println("Stack Overflow"); 
        } 
        else
        { 
            a[++top] = x; 
        } 
    } 
    char pop() 
    { 
        if (top < 0) 
        { 
        System.out.println("Stack Underflow"); 
        return 0; 
        } 
        else
        { 
            char x = a[top--]; 
            return x; 
        } 
    } 
} 
  
class string_stack
{ 
    public static void reverse(String str) 
    { 
        
        int n = str.length(); 
        Stack1 obj = new Stack1(n); 
          
        int i;
        for (i = 0; i < n; i++) 
        obj.push(str.charAt(i)); 
      
         String rev=new String();
        for (i = 0; i < n; i++) 
        {  
            char ch = obj.pop(); 
            rev+=ch;
        } 
        System.out.println("Reversed string is " + rev); 
    }  
    public static void main(String args[]) 
    { 
        String s= new String(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        s=sc.next();
          
        reverse(s); 
          
        
    } 
} 

