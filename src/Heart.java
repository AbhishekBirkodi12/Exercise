public class Heart {
    private int heartbeat;

    public Heart(int heartbeat) {
        this.heartbeat = heartbeat;
    }

    public int getHeartbeat() {
        return heartbeat;
    }
}

class Mobile {
    private String name;

    public Mobile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

class Student12 {
    Heart heart = new Heart(72);

    public void heartRate(int a) {
        System.out.println("Patient has a healthy heart with heartbeat rate " + a);
    }
}

class LaunchHeart {
    public static void main(String[] args) {
        //Bofore student12=null
        Student12 student12 = new Student12();
        Mobile mobile=new Mobile("Samsung");
        System.out.println(student12.heart.getHeartbeat());
        student12.heartRate(72);
        System.out.println(mobile.getName());
        //After making student12 null
        student12=null;
        System.out.println(mobile.getName());
        System.out.println(student12.heart.getHeartbeat());




    }
}
