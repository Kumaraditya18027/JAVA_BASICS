class first{
    public int a=9;
    protected int b=7;
    private int c=71;
    int g=91;
    public void meth1()
    {
        System.out.println(a+c);
    }
}

class second extends first{
    first ob=new first();
    void metho()
    {
        System.out.println(ob.a);//we can access all the memeber s of first except the private one as their private.
    }
}
public class access_modifier {
    public static void main(String args[])
    {
        first obj=new first();
        // System.out.println(obj.a+obj.c);here c can not be accesed as it is private member of class first.
        //System.out.println(obj.b);// b can be accesed by other class  as it is protected.
        System.out.println(obj.g);// g can be accesed with in the same package as it is default.
    }
    
}
