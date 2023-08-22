interface child1{
    void meth1();
}
interface parent1 extends child1{
    void meth2();
    void meth3();
}
class grandparent implements parent1{
    //since parent1 inhetrits child1 and meth1() is present in the child so,this also needed to be define.
   public  void meth1(){
        System.out.println("meth1");
    }

    public void meth2()
    {
        System.out.println("@");
    }

    public void meth3()
    {
        System.out.println("3");
    }
}
public class inheritance_in_interfaces {
    public static void main(String ard[])
    {
          grandparent obj= new grandparent();
          obj.meth1();
          obj.meth2();
          obj.meth3();
    }
    
}
