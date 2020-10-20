import java.util.*;

public class ListFunctions {
      public static void main(String args[])
      {
       Scanner s=new Scanner(System.in);
        System.out.println("1. Insert");
                 System.out.println("2. Search");
                 System.out.println("3. Delete");
                 System.out.println("4. Display");
                 System.out.println("5. Exit");
                 System.out.println("Enter Your Choice");
                 int v=s.nextInt();
       List<String> l=new ArrayList<String>();
               while(v!=5)
               {
                
                 switch(v)
                         {
                     case 1: 
                     {
                         System.out.println("Enter Item to be Inserted");
                         l.add(s.next());
                         System.out.println("Inserted Successfully");
                         break;
                     }
                     case 2:
                     {
                          System.out.println("Enter Item to seach");
                          String st=s.next();
                          int flag=0;
                          for(int i=0;i<l.size();i++)
                          {
                              
                              if(l.get(i).equals(st))
                              {
                                  System.out.println("Present");
                                  flag=1;
                                  break;
                              }
                          }
                          if(flag!=1)
                          System.out.println("Not Present");
                          break;
                     }
                     case 3:
                     {
                         System.out.println("Enter Item to Delete");
                         l.remove(s.next());
                         break;
                     }
                     case 4:
                     {
                         for(String str: l)
                         System.out.println(str);
                         break;
                     }
                     case 5:
                     {
                         return ;
                     }
                         }
                  System.out.println("1. Insert");
                 System.out.println("2. Search");
                 System.out.println("3. Delete");
                 System.out.println("4. Display");
                 System.out.println("5. Exit");
                 System.out.println("Enter Your Choice");
                 v=s.nextInt();
               }
      }    
}
