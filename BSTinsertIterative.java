import java.util.*;

public class BSTinsertIterative 
{
    static Node insert(Node root,int x)
    {
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null)
        {
            parent=curr;
            if(curr.key>x)
                curr=curr.left;
            else if(curr.key<x)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
       else if(parent.key>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }
    public static void main(String args[])
    {
        Node root=null;
        insert(root,10);
    }
}
