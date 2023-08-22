interface camera {
    void snap();

    void record_video();

    // This is a default method amd this method need not to be explicitly metioned
    // in the subclasses,but can be overrriden.
    default void record4k() {
        System.out.println("Recording in 4k...");
    }
}

interface wifi {
    String[] getnetwork();

    void network(String networks);
}

class Basic_phone {
    void call(int number) {
        System.out.println("Calling " + number);
    }
}

class smart_phone extends Basic_phone implements camera, wifi {
    // overriding the default method,
    public void record4k() {
        System.out.println("Recording in 4k and storing");
    }

    public void snap() {
        System.out.println("Sanp is beign taken....");
    }

    public void record_video() {
        System.out.println("Recording starts...");
    }

    public String[] getnetwork() {
        System.out.println("List of networks...");
        String[] s = { "dkhjieuhg", "dngbhger", "ravi586@" };
        return s;
    }

    public void network(String networks) {
        System.out.println("You are connected to network " + networks);
    }

}

public class default_methods {
    public static void main(String agrs[]) {
        smart_phone obj = new smart_phone();
        String[] arr = obj.getnetwork();
        for (String item : arr) {
            System.out.println(item);
        }

    }

}
