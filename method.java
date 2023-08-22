import java.util.Scanner;
public class method{
    static int fact(int x)
    {
        if(x==0||x==1)
        return 1;
        else
        return x*fact(x-1);
    }
    // The below code is written as a example of method over-loading
    static void fact()
    {
        System.out.println("HAPPY EXAMS");
    }
    //The below code is a exampleof variable arguments methods.
    static int sum(int x,int ...a)
    {
        int result=x;
        for(int i:a)
        {
            result+=i;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("The factorial is"+fact(x));
        fact();//method-overloading
        System.out.println(sum(1,2));//here 1 is the compulsory argument.
        System.out.println( sum(1,4,5,7));
        s.close();
    }
}
