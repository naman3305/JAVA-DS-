import java.util.LinkedList;
import java.util.*;
class Node3
{
     int key;
 Node3 left;
 Node3 right;
 Node3(int d)
 {
     key=d;
 }    
}
public class LevelOrderTraversal 
{
    static void printlevel(Node3 root)
    {
        if(root==null)
            return ;
        Queue<Node3> q=new LinkedList<Node3>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            Node3 curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        System.out.print(q);
    }
    public static void main(String args[])
    {
          Node3 root=new Node3(10);
      root.left=new Node3(20);
      root.right=new Node3(30);
      root.left.left=new Node3(40);
      root.left.right=new Node3(50);
      root.right.right=new Node3(70);
      root.right.right.right=new Node3(80);
      printlevel(root);
    }
    
}
