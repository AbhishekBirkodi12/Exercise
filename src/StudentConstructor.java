import java.util.Scanner;

public class StudentConstructor {
    private String name;
    private int age;
    private double percentage;
    private String school;

    public StudentConstructor(String name, int age, double percentage, String school) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSchool() {
        return school;
    }
}

class LaunchStudentConstructor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.next();
        System.out.println("Enter age");
        int age=scanner.nextInt();
        System.out.println("Enter percentage");
        double percentage=scanner.nextDouble();

        System.out.println("Enter school");
        String school=scanner.next();
        StudentConstructor studentConstructor = new StudentConstructor(name,age,percentage,school);
        System.out.println(studentConstructor.getName());
        System.out.println(studentConstructor.getAge());
        System.out.println(studentConstructor.getPercentage());
        System.out.println(studentConstructor.getSchool());
    }
}
