/*  creating thread by extending thread class*/
/*class myclass1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("Cooking");
            i++;
        }
    }
}
class myclass2 extends Thread
{
        @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("chating");
            i++;
        }
    }
}

public class ud_thread {
    public static void main(String[] args) {
        myclass1 t1= new myclass1();
        myclass2 t2= new myclass2();
        t1.start();
        t2.start();
    }
    
}*/

/*creating a thread using runnable interface */

class myclass1 implements Runnable
{
    @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("Cooking");
            i++;
        }
    }
}
class myclass2 implements Runnable
{
        @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("chating");
            i++;
        }
    }
}

public class ud_thread {
    public static void main(String[] args) {
        myclass1 o1= new myclass1();
        myclass2 o2= new myclass2();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();
    }
    
}

