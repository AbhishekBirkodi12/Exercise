public class MahaLaunch {
    public static void main(String[] args) {
        Collect1 collect1=new Collect1();
        Collect2 collect2=new Collect2();
        String name=collect1.collectName();
        int age=collect2.collectAge();
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }

}
