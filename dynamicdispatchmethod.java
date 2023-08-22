class phone
{
    public void on()
    {
        System.out.println("Turning on phone...");
    }
    public void msg()
    {
        System.out.println("Welcome...");
    }
}
class smartphone extends phone{
    public void on()
    {
        System.out.println("Turning on smart phone...");
    }
    public void music()
    {
            System.out.println("Playing music....");
    }
}
public class dynamicdispatchmethod {
    public static void main(String args[])
    {
            phone obj =new smartphone();//this is allowed to have reference to superclass while creating an object of subclass.
            //smartphone obj =new phone(); This is not allowed
            obj.on();//overrriden method of subclass will be exceuted.
            // obj.music();//The non-overriden methods of sub class will not be executed.
    }
    
}
