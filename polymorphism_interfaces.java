interface camera{
    void snap();
    void record_video();
    //This is a default method amd this method need not to be explicitly metioned in the subclasses,but can be overrriden.
    default void record4k()
    {
        System.out.println("Recording in 4k...");
    }
}
interface wifi{
    String[] getnetwork();
    void network(String networks);
}
class Basic_phone{
     void call(int number)
     {
        System.out.println("Calling "+ number);
     }
}
class smart_phone extends Basic_phone implements camera,wifi
{
    // overriding the default method,
      public void record4k()
      {
        System.out.println("Recording in 4k and storing");
      }
         public void snap()
         {
            System.out.println("Sanp is beign taken....");
         }
         public void record_video()
         {
            System.out.println("Recording starts...");
         }
         public String[] getnetwork()
         {
            System.out.println("List of networks...");
            String []s={"dkhjieuhg","dngbhger","ravi586@"};
            return s;
         }
         public void network(String networks)
         {
            System.out.println("You are connected to network "+ networks);
         }


} 
public class polymorphism_interfaces {
    
    public static void main(String ags[])
    {
        camera c=new smart_phone();// refrence of camera object of smart_phone.
        c.record_video();
        // c.network();This is not allowed and this is the property of polymorphism , here we can use only the features of camera present in the camera
        // or smartphoe or both
    }
}
