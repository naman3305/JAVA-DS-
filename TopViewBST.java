import java.util.Queue; 
import java.util.TreeMap; 
import java.util.LinkedList; 
import java.util.Map; 
import java.util.Map.Entry; 
  
// class to create a node 
class Node18 { 
    int data; 
    Node18 left, right; 
  
    public Node18(int data) { 
        this.data = data; 
        left = right = null; 
    } 
} 
  
// class of binary tree 
class TopViewBST { 
    Node18 root; 
  
    public TopViewBST() { 
        root = null; 
    } 
      
    // function should print the topView of 
    // the binary tree 
    private void TopView(Node18 root) { 
        class QueueObj { 
            Node18 node; 
            int hd; 
  
            QueueObj(Node18 node, int hd) { 
                this.node = node; 
                this.hd = hd; 
            } 
        } 
        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, Node18> topViewMap = new TreeMap<Integer, Node18>(); 
  
        if (root == null) { 
            return; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        } 
  
        System.out.println("The top view of the tree is : "); 
          
        // count function returns 1 if the container  
        // contains an element whose key is equivalent  
        // to hd, or returns zero otherwise. 
        while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!topViewMap.containsKey(tmpNode.hd)) { 
                topViewMap.put(tmpNode.hd, tmpNode.node); 
            } 
  
            if (tmpNode.node.left != null) { 
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        for (Entry<Integer, Node18> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().data); 
        } 
    } 
      
    // Driver Program to test above functions 
    public static void main(String[] args)  
    {  
        /* Create following Binary Tree  
            1  
        / \  
        2 3  
        \  
            4  
            \  
            5  
            \  
                6*/
        TopViewBST tree = new TopViewBST(); 
        tree.root = new Node18(1); 
        tree.root.left = new Node18(2); 
        tree.root.right = new Node18(3); 
        tree.root.left.right = new Node18(4); 
        tree.root.left.right.right = new Node18(5); 
        tree.root.left.right.right.right = new Node18(6); 
        System.out.println("Following are nodes in top view of Binary Tree");  
        tree.TopView(tree.root);  
    }  
      
} 