import java.util.*;

class Node8
{
    int key;
    Node8 left;
    Node8 right;
    Node8(int d){
      key=d;
}
}
public class ChildrenSum {
   static boolean isSum(Node8 root)
    {
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
        {
            sum+=root.left.key;
        }
        if(root.right!=null)
        {
            sum+=root.right.key;
        }
        return (root.key==sum && isSum(root.left) && isSum(root.right));
    }
    public static void main(String args[])
    {
           Node8 root=new Node8(20);
      root.left=new Node8(8);
      root.right=new Node8(12);
      root.left.left=new Node8(3);
      root.left.right=new Node8(5);
      System.out.print(isSum(root)?"Yes":"No");
    }
}
