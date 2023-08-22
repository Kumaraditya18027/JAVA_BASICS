

interface bicycle
{
    void speedup();
    void speedown();
}
interface horn{
    void horn1();
    void horn2();
}
class avon implements bicycle,horn{
    public void speedup()
    {
        System.out.println("We are increasing the speed of bicycle");
    }
    public void speedown()
    {
        System.out.println("We are decreasing the speed of bicycle");
    }
    public void horn1()
    {
        System.out.println("Peee poop pooop....");
    }
    public void horn2()
    {
        System.out.println("GANAN NA A ");
    }

}

public class interfaces {
    public static void main(String args[])
    {
        avon obj=new avon();
        obj.speedup();
        obj.speedown();
        obj.horn1();
        obj.horn2();
    }
    
}
