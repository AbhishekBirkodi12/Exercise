import java.util.Scanner;

public class CheckedException {
    void mymeth(){
        System.out.println("This is checkedException class");


    }}
    class nClass{
    void thisMethod(){
        System.out.println("This is nClass method");
    }
}
class LaunchCheckedEx{
    public static void main(String[] args) {
        try {
            System.out.println("Enter the name of the class that you are interested in loading");
            Scanner scanner=new Scanner(System.in);
            String className=scanner.next();
            Class.forName(className);
            System.out.println(className+" was successfully loaded");
        }catch (ClassNotFoundException e){
            System.out.println("Class that you are looking for could not be found");
        }
    }
}

