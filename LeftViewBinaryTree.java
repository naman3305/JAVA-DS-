import java.util.*;

class Node7
{
    int key;
    Node7 left;
    Node7 right;
    Node7(int d){
      key=d;
}
}
public class LeftViewBinaryTree 
{
   static int maxLevel=0;
  static  void printLeft(Node7 root,int level)
    {
        if(root==null)
            return ;
        if(maxLevel<level)
        {
            System.out.print(root.key+" ");
            maxLevel=level;
        }
        printLeft(root.left,level+1);
    }
   static void printLeftView(Node7 root)
    {
        printLeft(root,1);
    }
    public static void main(String args[])
    {
           Node7 root=new Node7(10);
      root.left=new Node7(20);
      root.right=new Node7(30);
      root.left.left=new Node7(40);
      root.left.right=new Node7(50);
      root.right.right=new Node7(70);
      root.right.right.right=new Node7(80);
      printLeftView(root);
    }
}
