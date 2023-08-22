import java.util.Scanner;
public class stringmethods
{
        public static void main(String a[]) 
        {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a string");
              String s= sc.nextLine();
              System.out.println(s.length());
              System.out.println(s.toLowerCase());
              System.out.println(s.toUpperCase());
              System.out.println(s.substring(2,5));
              sc.close();
            //   Ther are many more methods wriiten  in copy and on the web
        }  
}
