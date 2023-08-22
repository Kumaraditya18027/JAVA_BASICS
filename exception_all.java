import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString()
    {
        return "I am to String()";
    }
    @Override
    public String getMessage()
    {
     return "I am an Exception";
    }
}

public class exception_all {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9)
        {
            try{
                throw new myexception();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // e.printStackTrace();
            }
        }
    }
    
}
