import java.util.*;


    
class Node6
{
    int key;
    Node6 left;
    Node6 right;
    Node6(int d){
      key=d;
}
}
public class MaxBinaryTree {
    static int getMax(Node6 root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        else
            return Math.max((root.key),Math.max(getMax(root.left),getMax(root.right)));
    }
    public static void main(String args[])
    {
     Node6 root=new Node6(10);
      root.left=new Node6(20);
      root.right=new Node6(30);
      root.left.left=new Node6(40);
      root.left.right=new Node6(50);
      root.right.right=new Node6(70);
      root.right.right.right=new Node6(80);
      System.out.println(getMax(root));
    }
}
