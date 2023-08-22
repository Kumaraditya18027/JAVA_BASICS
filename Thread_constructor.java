class mythr extends Thread{
    public mythr(String name)
    {
        super(name);//invoking the constructor of the Thread class with by passing the argument.

    }
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("Illustrious");
            i++;
        }
    }
}
public class Thread_constructor {
    public static void main(String[] args) {
        mythr obj=new mythr("ravindra");
        obj.start();
        System.out.println(obj.getId());// it is used to get the id of the thread.
        System.out.println(obj.getName());// it is used to get the name of the thread.
    }
}

