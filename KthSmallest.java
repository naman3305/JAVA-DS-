import java.io.*;
// A BST node
class Node14 {
    int data;
    Node14 left, right;
    Node14(int x)
    {
        data = x;
        left = right = null;
    }
}
 
class KthSmallest{
    
    static int count = 0; 
    public static Node14 insert(Node14 root, int x)
    {
        if (root == null)
            return new Node14(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
      
    public static Node14 kthSmallest(Node14 root, int k)
    {
        if (root == null)
            return null;
      
        Node14 left = kthSmallest(root.left, k);
      
        if (left != null)
            return left;
        count++;
        if (count == k)
            return root;
      
        return kthSmallest(root.right, k);
    }
      
    public static void printKthSmallest(Node14 root, int k)
    {
        count = 0;
         
        Node14 res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                        + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }
         
    public static void main (String[] args) {
         
        Node14 root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
      
        for (int x : keys)
            root = insert(root, x);
         
        int k = 3;
        printKthSmallest(root, k);
         
         
    }
}

