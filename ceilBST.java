import java.util.*;

public class ceilBST {
  static int Ceil(Node node, int input) 
    {  
        if (node == null) { 
            return -1; 
        } 
        if (node.key == input) { 
            return node.key; 
        } 
  
        if (node.key < input) { 
            return Ceil(node.right, input); 
        } 
  
        int ceil = Ceil(node.left, input); 
  
        return (ceil >= input) ? ceil : node.key; 
    }   
  public static void main(String args[])
  {
       Node root=new Node(50);
      root.left=new Node(30);
      root.right=new Node(70);
      root.left.left=new Node(10);
      root.left.right=new Node(40);
      root.right.left=new Node(60);
      root.right.right=new Node(80);
      
      System.out.println(Ceil(root,20));
      
  }
}
