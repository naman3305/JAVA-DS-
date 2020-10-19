import java.util.*;

public class CountNodes {
    static int countNode(Node root)
    {
        int lh=0,rh=0;
        Node curr=root;
        while(curr!=null)
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null)
        {
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
            return ((int)(Math.pow(2, lh)-1));
        return countNode(root.left)+countNode(root.right);
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
        System.out.println(countNode(root));
    }
}
