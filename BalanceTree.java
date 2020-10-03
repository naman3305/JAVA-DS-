import java.util.*;
class Node9
{
    int key;
    Node9 left;
    Node9 right;
    Node9(int d){
      key=d;
}
}
public class BalanceTree {
    static int isBal(Node9 root)
    {
        if(root==null)return 0;
        int lh=isBal(root.left);
        if(lh==-1)return -1;
        int rh=isBal(root.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        else return Math.max(lh,rh)+1;
    }
    public static void main(String args[])
    {
         Node9 root=new Node9(18);
      root.left=new Node9(4);
      root.right=new Node9(20);
      root.right.left=new Node9(13);
      root.right.right=new Node9(70);
      System.out.print(isBal(root));
    }
}
