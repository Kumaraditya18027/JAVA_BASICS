class base{
       int math,physics;
       String name;
       //This is a constructor, we can also overload a constructor by creating the constructrs with the same name but passsing different no. of parameters or no parameters.
       base(int a,int b,String n)
       {
        this.math=a;
        this.physics=b;
        this.name=n;
       }
   void getdetails()
    {
        System.out.println("YOUR NAME IS "+name);
        System.out.println("YOUR TOTAL MARKS ARE "+(math+physics));
    }
}
//This is a derived class from the base class.
class derived extends base{
         int chemistry;
            derived(int a,int b,int c,String n)
            {
                super(a,b,n);
                this.chemistry=c;
                System.out.println("MY NAME IS "+ name+" AND MY TOTAL MARKS IS "+(physics+math+chemistry));

            }
}
public class inheritance_constructors {


    public static void main(String arg[])
    {
        base ob=new base(33,45,"RAVI");
        ob.getdetails();
        derived obj1= new derived(97,89,79,"SHYAM");
    }


    
}
