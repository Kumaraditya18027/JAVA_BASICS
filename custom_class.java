class employee
{
    int id;
    int salary;
    String name;
    public void set(int a,int b,String s)
    {
        id=a;salary=b;name=s;
    }
    public int  getsalary()
    {
        return salary;
    }
}
public class custom_class {
    public static void main(String arg[])
    {
        //Here we are going to create an object for a custom class
        employee a=new employee();
        a.set(1,3444557,"RAMESH CHAUHAN");
        System.out.println(a.getsalary());

    }
    
}
