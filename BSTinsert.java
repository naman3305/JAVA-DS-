import java.util.*;

public class BSTinsert
{
    static Node insert(Node root,int x)
    {
        if(root==null)
            return new Node(x);
        if(root.key>x)
            root.left=insert(root.left,x);
        else if(root.key<x)
            root.right=insert(root.right,x);
        return root;
    }
    public static void main(String args[])
    {
        Node root=null;
        insert(root,10);
    }
}
