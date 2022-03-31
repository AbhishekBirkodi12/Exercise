import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Enter name,marks,age,percentage");
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int marks=scanner.nextInt();
        int age=scanner.nextInt();
        long percentage=scanner.nextLong();
        student.setName(name);
        student.setMarks(marks);
        student.setAge(age);
        student.setPercentage(percentage);
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        System.out.println(student.getAge());
        System.out.println(student.getPercentage());
    }
}
