import java.util.*;
import java.util.LinkedList;
class Node10{
    int key;
    Node10 left;
    Node10 right;
    Node10(int d)
    {
        key=d;
    }
}
public class MaxWidthBinaryTree {
    static int  maxWidth(Node10 root)
    {
        if(root==null)return 0;
        Queue<Node10> q=new LinkedList<Node10>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false)
        {
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++)
            {
                Node10 curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Node10 root=new Node10(8);
        root.left=new Node10(30);
        root.left.left=new Node10(90);
        root.left.right=new Node10(100);
        root.right=new Node10(20);
        root.right.left=new Node10(70);
        root.right.right=new Node10(300);
        System.out.println(maxWidth(root));
    }
}
