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
            System.out.println("Illustrious " +this.getName());
            i++;
        }
    }
}

public class Thread_priorities {
     public static void main(String[] args) {
        mythr obj1=new mythr("ravindra1");
        mythr obj2=new mythr("ravindra2");
        mythr obj3=new mythr("ravindra3");
        mythr obj4=new mythr("ravindra4");
        mythr obj5=new mythr("ravindra5");
        // obj3.setPriority(10); FOR MAX_PRIORITY 10, MIN-PRIORITY 1,NORM_PRIORITY 5
        obj3.setPriority(Thread.MAX_PRIORITY);// this is used to priortise the thread over other threads, JVM uses normal pripority but we can use MIN_PRIORITY or MAX_PRIORITY
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }
    
}
