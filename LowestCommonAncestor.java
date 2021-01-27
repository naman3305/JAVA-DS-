import java.util.*;
import java.util.ArrayList;

public class LowestCommonAncestor
{
   static boolean findPath(Node root,ArrayList<Node> p,int n)
    {
        if(root==null)
            return false;
        p.add(root);
        if(root.key==n)
            return true;
        if(findPath(root.left,p,n)|| findPath(root.right,p,n))
            return true;
        p.remove(p.size()-1);
        return false;
    }
   static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node> path1=new ArrayList<Node>();
        ArrayList<Node> path2=new ArrayList<Node>();
        if(findPath(root,path1,n1)==false || findPath(root,path2,n2)==false)
            return null;
        for(int i=0;i<path1.size()-1 && i<path2.size()-1;i++)
        {
            if(path1.get(i+1)!=path2.get(i+1))
                return path1.get(i);
        }
        return null;
    }
   public static void main(String args[])
   {
       Node root=new Node(10);
       root.left=new Node(20);
       root.right=new Node(30);
       root.right.left=new Node(40);
       root.right.right=new Node(50);
       root.right.left.left=new Node(60);
       root.right.right.left=new Node(70);
        root.right.right.right=new Node(80);
        Node temp=lca(root,60,70);
        System.out.println(temp.key);
   }
}
