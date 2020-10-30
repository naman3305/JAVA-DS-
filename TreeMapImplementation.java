import java.util.*; 
import java.util.concurrent.*; 
  
public class TreeMapImplementation { 
  
    static TreeMap<Integer, String> tree_map; 
  
    static void create() 
    { 
        tree_map 
            = new TreeMap<Integer, String>(); 
  
        System.out.println( 
            "TreeMap successfully"
            + " created"); 
    } 
  
    static void insert() 
    { 
        tree_map.put(10, "A"); 
        tree_map.put(15, "4"); 
        tree_map.put(20, "A"); 
        tree_map.put(25, "B"); 
        tree_map.put(30, "C"); 
  
        System.out.println( 
            "\nElements successfully"
            + " inserted in the TreeMap"); 
    } 
  
    static void search(int key) 
    { 
        System.out.println( 
            "\nIs key \""
            + key + "\" present? "
            + tree_map.containsKey(key)); 
    } 
  
    static void search(String value) 
    { 
  
        System.out.println( 
            "\nIs value \""
            + value + "\" present? "
            + tree_map.containsValue(value)); 
    } 
  
    static void display() 
    { 
        System.out.println( 
            "\nDisplaying the TreeMap:"); 
  
        System.out.println( 
            "TreeMap: " + tree_map); 
    } 
  
    static void traverse() 
    { 
        System.out.println("\nTraversing the TreeMap:"); 
        for (Map.Entry<Integer, String> e : tree_map.entrySet()) 
            System.out.println(e.getKey() 
                               + " "
                               + e.getValue()); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        create(); 
  
        insert(); 
  
        search(50); 
  
        search("A"); 
  
        display(); 
  
        traverse(); 
    } 
} 