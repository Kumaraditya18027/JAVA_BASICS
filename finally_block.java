
public class finally_block {
    public static int test(){
    try
    {
        
         int a=9;
        int b=9;
        int c=a/b;
        return c;
    }
    catch(Exception e)
    {
        System.out.println("Exaception");

    }
    finally{
    System.out.println("Finally statement");
    }
    //Here the finally block has been executed even after the exception is not handled.
    return 0;

}
    public static void main(String[] args) {
       int k=test();
       System.out.println(k);
    }
    
}
