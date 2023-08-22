abstract class parent//the class is abstract as it contains abstract method
{
    public void greet()
    {
        System.out.println("Welcome....");
    }
    abstract public void aftergreet();//This is a abstract method,each child class can define it as per their convienence.
}
class child1 extends parent{
    public void aftergreet()
    {
        System.out.println("What do you want tea or coffee?...");
    }
}
abstract class child2 extends parent{
    //Since this class is inherited from an abstract class and it does not contains the abstract method so it have to be defined as abstract class.
    public void lunch()
    {
        System.out.println("We have panner in our lunch...");
    }
}
public class abstract_classes {
    public static void main(String args[])
    {
        //  parent obj =new parent(); parent for abstract class can not be created
        child1 obj=new child1();
        obj.aftergreet();
    }
}
