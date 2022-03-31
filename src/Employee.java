import java.util.Scanner;

public class Employee {
    private String name;
    private byte age;
    private double salary;

    public Employee(String name, byte age, double salary) { //Setting the values through constructor
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class Alpha {


    String highestPaidEmployeeName(Employee[] employeeList) {//First method body

        double emp1 = employeeList[0].getSalary();
        int index=0;
        for(int i=0;i<employeeList.length;i++){
            if(employeeList[i].getSalary()>emp1){
                emp1=employeeList[i].getSalary();
                index=i;
            }

        }return employeeList[index].getName();//returning the Name
        /*double emp2 = employeeList[1].getSalary();//This block is meant for the hardcoded code
        double emp3 = employeeList[2].getSalary();
        if ((emp1 > emp2) && (emp1 > emp3)) {
            return "Alex is the highest paid";
        } else if ((emp2 > emp1) && (emp2 > emp3)) {
            return "Bob is the Highest paid ";
        } else {
            return "Charlie is the highest paid";
        }*/
    }

    String lowestPaidEmployee(Employee[] employeeList) {
        int index=0;
        double emp1 = employeeList[0].getSalary();
        for(int i=0;i<employeeList.length;i++){
            if(employeeList[i].getSalary()<emp1){
                emp1=employeeList[i].getSalary();
                index=i;

            }
        }return employeeList[index].getName();

       /* double emp2 = employeeList[1].getSalary();
        double emp3 = employeeList[2].getSalary();
        if ((emp1 < emp2) && (emp1 < emp3)) {
            return "Alex is the lowest paid";
        } else if ((emp2 < emp1) && (emp2 < emp3)) {
            return "Bob is the lowest paid ";
        } else {
            return "Charlie is the lowest paid";
        }*/
    }

    double highestSalary(Employee[] employeeList) {
        double emp1 = employeeList[0].getSalary();
        int index=0;
        for (int i=0;i<employeeList.length;i++){
            if(employeeList[i].getSalary()>emp1){
                emp1=employeeList[i].getSalary();
                index=i;
            }
        }
        return employeeList[index].getSalary();

       /* double emp2 = employeeList[1].getSalary();//This block is meant for hardcoded values
        double emp3 = employeeList[2].getSalary();
        if ((emp1 > emp2) && (emp1 > emp3)) {
            return employeeList[0].getSalary();
        } else if ((emp2 > emp1) && (emp2 > emp3)) {
            return employeeList[1].getSalary();
        } else {
            return employeeList[2].getSalary();
        }*/
    }

    double lowestSalary(Employee[] employeeList) {
        double emp1 = employeeList[0].getSalary();
        int index=0;
       for(int i=0;i<employeeList.length;i++){
           if(employeeList[i].getSalary()<emp1){
               emp1=employeeList[i].getSalary();
               index=i;

           }
       }
       return employeeList[index].getSalary();
        /*double emp2 = employeeList[1].getSalary();
        double emp3 = employeeList[2].getSalary();
        if ((emp1 < emp2) && (emp1 < emp3)) {
            return employeeList[0].getSalary();
        } else if ((emp2 < emp1) && (emp2 < emp3)) {
            return employeeList[1].getSalary();
        } else {
            return employeeList[2].getSalary();
        }*/

    }

    Employee agedEmployee(Employee[] employeeList) {

        int  index=0;
        byte emp1 = employeeList[0].getAge();
        for(int i=0;i<employeeList.length;i++){
            if(employeeList[i].getAge()>emp1){
                emp1=employeeList[i].getAge();
                index=i;

            }

        }       /* double emp2 = employeeList[1].getAge();
        double emp3 = employeeList[2].getAge();
        if ((emp1 > emp2) && (emp1 > emp3)) {
            return employeeList[0];
        } else if ((emp2 > emp1) && (emp2 > emp3)) {
            return employeeList[1];
        } else {
            return employeeList[2];
        }*/
        return employeeList[index];
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int N=scanner.nextInt();
        Employee[] e = new Employee[N];





        for(int i=0;i<e.length;i++){
            System.out.println("Enter the employee details of Employee number "+(i+1));
            System.out.println("Enter the name");
            String name=scanner.next();
            System.out.println("Enter age");
            byte age=scanner.nextByte();
            System.out.println("Enter salary");
            double salary=scanner.nextDouble();
            e[i]=new Employee(name,age,salary);
        }
         Alpha a=new Alpha();
        System.out.println("Highest paid employee is : "+a.highestPaidEmployeeName(e));
        System.out.println("Lowest paid employee is : "+a.lowestPaidEmployee(e));
        System.out.println("Highest salary is : " + a.highestSalary(e));
        System.out.println("Lowest salary is : " + a.lowestSalary(e));
        Employee d= a.agedEmployee(e);

        System.out.println("Details of the aged Employee :");
        System.out.println("Name :"+d.getName());
        System.out.println("Age :"+d.getAge());
        System.out.println("Salary :"+d.getSalary());
    }
}
