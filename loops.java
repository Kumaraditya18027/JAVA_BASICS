import java.util.Scanner;
public class loops {
    public static void main(String args[])
    {
      Scanner s=new Scanner (System.in);
       System.out.println("Enter the number whose factorial is to be found");
       int x=s.nextInt();
       int result=1;
       /*while loop */
       //while(x>0)
       //{
       // result=result*x;
       // x--;
       //}
       /*do-while loop */
      //do{
      // result=result*x;
      // x--;
      //}while(x>0);
      /*for- loops */
      //for(;x>0;x--)
      //{
        result=result*x;
      //}
       System.out.println(result);
      s.close();
    }
    
}
