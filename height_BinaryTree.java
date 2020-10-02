import java.util.*;
class Node1
{
 int key;
 Node1 left;
 Node1 right;
 Node1(int d)
 {
     key=d;
 }  
}

public  class height_BinaryTree {
   static int height(Node1 root)
    {
        if(root==null)
            return 0;
        else
            return (1+Math.max(height(root.left),height(root.right)));
    }
     public static void main(String args[])
  {
      Node1 root=new Node1(10);
      root.left=new Node1(20);
      root.right=new Node1(30);
      root.right.left=new Node1(40);
      root.right.right=new Node1(50);
      System.out.println("Height of binary tree is: "+height(root));
  }
}
