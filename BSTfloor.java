import java.util.*;

public class BSTfloor {
    static Node floor(Node root,int x)
    {
        Node res=null;
        while(root!=null)
        {
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else
            {
                res=root;
                root=root.right;
            }
        }
        return res;
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
      
      Node curr=floor(root,20);
      System.out.println(curr.key);
    }
}
