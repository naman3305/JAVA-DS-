import java.util.*;

class Node5
{
    int key;
    Node5 left;
    Node5 right;
    Node5(int d){
      key=d;
}
}
public class SizeBinaryTree
{
    static int getSize(Node5 root)
    {
        if(root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }
    public static void main(String args[])
    {
     Node5 root=new Node5(10);
      root.left=new Node5(20);
      root.right=new Node5(30);
      root.left.left=new Node5(40);
      root.left.right=new Node5(50);
      root.right.right=new Node5(70);
      root.right.right.right=new Node5(80);
      System.out.println(getSize(root));
    }
}
