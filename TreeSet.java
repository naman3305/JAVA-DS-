import java.util.*; 
  
class TreeSetExample { 
  
    public static void main(String[] args) 
    { 
          TreeSet<String> s=new TreeSet<String>();
            s.add("test");
            s.add("DSA");
            s.add("TreeSet");
            System.out.println(s);
            System.out.println(s.contains("DSA"));
            Iterator<String> i=s.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
    } 
} 