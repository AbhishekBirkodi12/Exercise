package IOFile;

import java.io.*;
import java.util.Scanner;

public class StudentFile {
    int age;
    String name;
    int marks1;
    int marks2;

    public StudentFile(int age, String name, int marks1, int marks2) {
        this.age = age;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }



    @Override
    public String toString() {
        return "StudentFile{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks1=" + marks1 +
                ", marks2=" + marks2 +
                '}';
    }
}

class StudentDataFile {
    public static void main(String[] args) throws IOException {

       /* s[0] = new StudentFile(23, "Abhishek", 100, 100);
        s[1] = new StudentFile(22, "Sachin", 97, 98);
        s[2] = new StudentFile(22, "Sujith", 95, 95);
        s[3] = new StudentFile(22, "Nisar", 95, 95);
        s[4] = new StudentFile(25, "Jaggu", 90, 93);
        s[5] = new StudentFile(23, "Harish", 76, 83);
        s[6] = new StudentFile(23, "Ashwin", 85, 78);
        s[7] = new StudentFile(22, "Pranav", 89, 92);
        s[8] = new StudentFile(22, "Jiyon", 95, 95);
        s[9] = new StudentFile(24, "Santosh", 60, 78);*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size=scanner.nextInt();
        StudentFile[] s = new StudentFile[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter the age of student "+(i+1));
            int age=scanner.nextInt();
            System.out.println("Enter the name of student "+(i+1));
            String name=scanner.next();
            System.out.println("Enter the marks1 of student "+(i+1));
            int marks1=scanner.nextInt();
            System.out.println("Enter the marks2 of student "+(i+1));
            int marks2=scanner.nextInt();
            s[i]=new StudentFile(age,name,marks1,marks2);
        }


        String path = "D:\\IpOp\\ipop\\studentinfo.txt";
        File file = new File(path);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < s.length; i++) {
            String studentFile = s[i].toString();
            writer.write(studentFile);
            writer.append("\n");
            writer.flush();

        }

        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String x = bufferedReader.readLine();
        while (x != null) {
            System.out.println(x);
            x = bufferedReader.readLine();
        }


    }
}

