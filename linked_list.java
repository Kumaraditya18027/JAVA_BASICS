import java.util.*;

public class linked_list {
      public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList <Integer>();
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.addLast(44);
        l1.addFirst(3267);
      
        
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+ " ");
        }
       
    }
    
    
}
