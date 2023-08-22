import java.util.Scanner;
class intial
{
    public static void main(String ar[])
    {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      int a=sc.nextInt();
      System.out.println("Enter the second number ");
      int b=sc.nextInt();
      if(a>b)
      System.out.println("Num 1 is greater than Num 2");
      else
      System.out.println("Num2 is greater");
    //   System.out.println("Enter a number to check");
    //   boolean x=sc.hasNextInt();//This takes the input as a int and checks whether the it is int or not and stores the corresponding value in boolean data type.
    //   System.out.println(x);
      String s=sc.next();//this method takes only one input as a word not more than a word
    //   To take a whole line as input we need to use nextline() method
    //   String p=sc.nextLine();
    System.out.println(s);
      sc.close();
    
    }
}