class Node15 
{ 
    int data; 
    Node15 left, right; 
  
    public Node15(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
  
public class CheckBST
{ 
    //Root of the Binary Tree 
    Node15 root; 
  
    /* can give min and max value according to your code or 
    can write a function to find min and max value of tree. */
  
    /* returns true if given search tree is binary 
     search tree (efficient version) */
    boolean isBST()  
    { 
        return isBSTUtil(root, Integer.MIN_VALUE, 
                               Integer.MAX_VALUE); 
    } 
  
    /* Returns true if the given tree is a BST and its 
      values are >= min and <= max. */
    boolean isBSTUtil(Node15 node, int min, int max) 
    { 
        /* an empty tree is BST */
        if (node == null) 
            return true; 
  
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max) 
            return false; 
  
        /* otherwise check the subtrees recursively 
        tightening the min/max constraints */
        // Allow only distinct values 
        return (isBSTUtil(node.left, min, node.data-1) && 
                isBSTUtil(node.right, node.data+1, max)); 
    } 
  
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
        CheckBST tree = new CheckBST(); 
        tree.root = new Node15(4); 
        tree.root.left = new Node15(2); 
        tree.root.right = new Node15(5); 
        tree.root.left.left = new Node15(1); 
        tree.root.left.right = new Node15(3); 
  
        if (tree.isBST()) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST"); 
    } 
} 
