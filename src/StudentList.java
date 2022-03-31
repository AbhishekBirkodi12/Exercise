import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    int rollNumber;
    int marks1;
    int marks2;
    int marks3;


    public StudentList(int rollNumber, int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.rollNumber = rollNumber;
    }




    @Override
    public String toString() {
        return "{" +
                "rollNumber=" + rollNumber +
                ", marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +

                '}';
    }

}



class LaunchStudentList {
    public static void main(String[] args) {
        StudentList studentList = new StudentList(9, 78, 85, 35);
        StudentList studentList1 = new StudentList(6, 56, 95, 65);
        StudentList studentList2 = new StudentList(1, 68, 34, 100);
        ArrayList al = new ArrayList();
        al.add(studentList);
        al.add(studentList1);
        al.add(studentList2);
        System.out.println("Before sorting \n" + al);


        Collections.sort(al,  new Comparator(){


            public int compare(Object o1, Object o2) {
                if (((StudentList) (o1)).rollNumber>((StudentList)(o2)).rollNumber){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        System.out.println("After sorting \n" + al);


    }
}