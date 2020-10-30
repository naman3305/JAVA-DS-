import java.util.*;
import java.lang.*;
import java.io.*;
 
class Node16 {
 
    int data;
    Node16 left, right;
 
    Node16(int d) {
        data = d;
        left = right = null;
    }
}
 
class BinaryTree
{
    Node16 first, middle, last, prev;
    
    void correctBSTUtil( Node16 root)
    {
        if( root != null )
        {
            correctBSTUtil( root.left);
 
            if (prev != null && root.data <
                                prev.data)
            {
                if (first == null)
                {
                    first = prev;
                    middle = root;
                }
 
                else
                    last = root;
            }
 
            prev = root;
 
            
            correctBSTUtil( root.right);
        }
    }

    void correctBST( Node16 root )
    {
       
        first = middle = last = prev = null;
 
        correctBSTUtil( root );
 
        if( first != null && last != null )
        {
            int temp = first.data;
            first.data = last.data;
            last.data = temp; 
        }
        else if( first != null && middle !=
                                    null ) 
        {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
 
    }
 
    void printInorder(Node16 node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(" " + node.data);
        printInorder(node.right);
    }
 
 
    public static void main (String[] args) 
    {
        /*   6
            / \
           10  2
          / \ / \
         1  3 7 12
         
        10 and 2 are swapped
        */
 
        Node16 root = new Node16(6);
        root.left = new Node16(10);
        root.right = new Node16(2);
        root.left.left = new Node16(1);
        root.left.right = new Node16(3);
        root.right.right = new Node16(12);
        root.right.left = new Node16(7);
 
        System.out.println("Inorder Traversal"+
                        " of the original tree");
        BinaryTree tree = new BinaryTree();
        tree.printInorder(root);
 
        tree.correctBST(root);
 
        System.out.println("\nInorder Traversal"+
                          " of the fixed tree");
        tree.printInorder(root);
    }
}