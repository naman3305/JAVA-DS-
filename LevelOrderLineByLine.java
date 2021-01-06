import java.util.*;
import java.util.LinkedList;

class Node4
{
    int key;
    Node4 left;
    Node4 right;
    Node4(int d){
      key=d;
}
}
public class LevelOrderLineByLine 
{
    static void printlevel(Node4 root)
    {
        if(root==null)
            return ;
        Queue<Node4> q=new LinkedList<Node4>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node4 curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                 if(curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
         Node4 root=new Node4(10);
      root.left=new Node4(20);
      root.right=new Node4(30);
      root.left.left=new Node4(40);
      root.left.right=new Node4(50);
      root.right.right=new Node4(70);
      root.right.right.right=new Node4(80);
      printlevel(root);
    }
}
