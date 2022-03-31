import java.util.Scanner;

public class CustomerInherit {
    private String name;
    private String address;
    private int age;
    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

class SeniorCitizenCustomer extends CustomerInherit {



    double generateBillAmount(double amount) {
        return  0.12 * amount;
    }
}

class PrivilegeCustomer extends CustomerInherit {
    double billAmount(double amount) {
        return  0.3 * amount;
    }
}

class LaunchInherit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerInherit customerInherit = new CustomerInherit();
        SeniorCitizenCustomer seniorCitizenCustomer = new SeniorCitizenCustomer();
        PrivilegeCustomer privilegeCustomer = new PrivilegeCustomer();
        System.out.println("1)Privilege customer\n2)SeniorCitizenCustomer");
        System.out.println("Enter the customer type");
        int choice = scanner.nextInt();


        if (choice == 1) {
            System.out.println("Enter the name");
            String namePrivilege = scanner.next();
            privilegeCustomer.setName(namePrivilege);
            System.out.println("Enter the age");
            int agePrivilege = scanner.nextInt();
            privilegeCustomer.setAge(agePrivilege);
            System.out.println("Enter the address");
            String addressPrivilege = scanner.next();
            privilegeCustomer.setAddress(addressPrivilege);
            System.out.println("Enter the mobile number");
            String mobileNumberPrivilege = scanner.next();
            privilegeCustomer.setMobileNumber(mobileNumberPrivilege);
            System.out.println("Enter the purchase amount");
            double amountPrivilege = scanner.nextDouble();
            double finalAmount1 = privilegeCustomer.billAmount(amountPrivilege);
            System.out.println("Bill details");
            System.out.println("Name : " + privilegeCustomer.getName());
            System.out.println("Mobile : " + privilegeCustomer.getMobileNumber());
            System.out.println("Age :" + privilegeCustomer.getAge());
            System.out.println("Address :" + privilegeCustomer.getAddress());
            System.out.println("Your bill amount is " + amountPrivilege + ".Your bill amount is discount under privilege customer\n You have to pay " + (amountPrivilege - finalAmount1));

        } else {

            System.out.println("Enter the name");
            String nameSenior = scanner.next();
            seniorCitizenCustomer.setName(nameSenior);
            System.out.println("Enter the age");
            int ageSenior = scanner.nextInt();
            seniorCitizenCustomer.setAge(ageSenior);
            System.out.println("Enter the address");
            String addressSenior = scanner.next();
            seniorCitizenCustomer.setAddress(addressSenior);
            System.out.println("Enter the mobile number");
            String mobileNumberSenior = scanner.next();
            seniorCitizenCustomer.setMobileNumber(mobileNumberSenior);
            System.out.println("Enter the purchase amount");
            double amountSenior = scanner.nextDouble();
            double finalAmount2 = seniorCitizenCustomer.generateBillAmount(amountSenior);
            System.out.println("Bill details");
            System.out.println("Name : " + seniorCitizenCustomer.getName());
            System.out.println("Mobile : " + seniorCitizenCustomer.getMobileNumber());
            System.out.println("Age :" + seniorCitizenCustomer.getAge());
            System.out.println("Address :" + seniorCitizenCustomer.getAddress());
            System.out.println("Your bill amount is " + amountSenior + ".Your bill amount is discount under Senior Citizen customer\n You have to pay " + (amountSenior - finalAmount2));

        }


    }
}


