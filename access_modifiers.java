class employee{
    //private int salary,id; If it is made private then only the methods of this class can acess this directly . 

    private int salary,id;
    String name;
    void set(String n,int s)
    {
        this.name=n;
        this.salary=s;
    }

}
public class access_modifiers {
    public static void main(String args[])
    {
       employee aman =new employee();
    //    aman.id=123;
    //    aman.salary=55555;
    //    aman.name="RAVI";
    aman.set("ravi",789);
       System.out.println(aman.name);
    }
    
}
