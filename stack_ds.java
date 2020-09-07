import java.util.*;

class Stack { 
    int MAX; 
    int top; 
    int a[]; 
    
    Stack() 
    { 
        Scanner sc=new Scanner(System.in);
        top = -1; 
        System.out.println("Enter max size of stack");
        MAX=sc.nextInt();
        a= new int[MAX];
    } 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    }
    void push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
        } 
    } 
  
    void pop() 
    { 
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
        } 
        else { 
            int x = a[top--]; 
            System.out.println(x + " Popped from stack");
        } 
    } 
} 
  
class stack_ds{ 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
       s.pop();
      } 
} 

