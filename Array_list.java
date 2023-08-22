import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList <Integer>();
        l1.add(5);
        l1.add(7);
        l1.add(9);
       Iterator<Integer> iter=l1.iterator();//The iterator() method of ArrayList class in Java Collection Framework is used to get an iterator over the elements in this list in proper sequence
        
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+ " ");
        }
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
    
}
