import java.util.*;
class Node2
{
  int key;
 Node2 left;
 Node2 right;
 Node2(int d)
 {
     key=d;
 }    
}
public class NodeDistanceK {
    static void print(Node2 root,int k)
    {
        if(root==null)
            return ;
        if(k==0)
            System.out.print(root.key+" ");
        else
        {
            print(root.left,k-1);
            print(root.right,k-1);
        }
    }
    public static void main(String args[])
    {
        Node2 root=new Node2(10);
      root.left=new Node2(20);
      root.right=new Node2(30);
      root.left.left=new Node2(40);
      root.left.right=new Node2(50);
      root.right.right=new Node2(70);
      root.right.right.right=new Node2(80);
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      System.out.print("Nodes at Distance "+k+" are: ");
      print(root,k);
    }
}
