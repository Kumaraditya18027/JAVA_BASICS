import java.util.Scanner;
public class array {
    public static void main(String args[])
    {
         //array declaration and memeory allocation together can be done as
         //int []marks=new int[5];
         //Here marks is a refrence to the object created(array) and new is used to allocate memory in the heap.
         //Another method is to declare and intialize at the smae time, here we need not to give the size it will 
         // take space as per the no. of elemeetns specified.
         //int []marks={1,2,3,4,5};
         Scanner s=new Scanner(System.in);
        //for(int i=0;i<5;i++)
        //{
        //   marks[i]=s.nextInt();
        //}
         //for(int i=0;i<5;i++)
         //{
         //   System.out.println(marks[i]);
         //}
         /* for each loop */
       // for(int x:marks)
       // {
       //    System.out.println(x);
       // }
         /*MultiDimensional Array */
         int [][]flats=new int[2][3];
         for(int i=0;i<2;i++)
         {
            for(int j=0;j<3;j++)
            {
                flats[i][j]=s.nextInt();
            }
         }
         for(int i=0;i<2;i++)
         {
            for(int j=0;j<3;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
         }
         s.close();

    }
}
