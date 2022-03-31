import java.util.Scanner;

public class WeakPasswordException extends Exception {
    public WeakPasswordException(String s) {
        super(s);
    }

}

class User {
    private String name;
    private String mobile;
    private String userName;
    private String password;

    public User(String name, String mobile, String userName, String password) {
        this.name = name;
        this.mobile = mobile;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

class UserBo {
    public void validate(User u) throws WeakPasswordException {
        boolean lenghtCheck = false;
        boolean specialCharacterCheck = false;
        boolean digitCheck = false;

        if (u.getPassword().length() >= 10 && u.getPassword().length() <= 20) {
            lenghtCheck = true;

        }
        char[] c = u.getPassword().toCharArray();
        for (char d : c) {

            if ((!Character.isLetter(d)) && (!Character.isSpaceChar(d))) {
                specialCharacterCheck = true;
                if (!Character.isDigit(d)) {
                    digitCheck = true;
                }
            }else {
                if (!lenghtCheck) {
                    throw new WeakPasswordException("WeakPasswordException:Password length should be grater than 10 and less than 20");
                }
                if (!specialCharacterCheck) {
                    throw new WeakPasswordException("WeakPasswordException:Password must contain atleast one special character ");
                }
                if (!digitCheck) {
                    throw new WeakPasswordException("WeakPasswordException:Password must contain atleast one digit");
                }
            }


        }
    }
}

        class WeakPasswordMain {
            public static void main(String[] args) throws WeakPasswordException {
                System.out.println("Enter the user details");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the name");
                String name = scanner.next();
                System.out.println("Enter the mobile number");
                String mobile = scanner.next();
                System.out.println("Enter the userName");
                String userName = scanner.next();
                System.out.println("Enter the password");
                String password = scanner.next();
                User user = new User(name, mobile, userName, password);
                UserBo userBo = new UserBo();
                try {
                    userBo.validate(user);
                    System.out.println("Name :" + user.getName());
                    System.out.println("Mobile :" + user.getMobile());
                    System.out.println("UserName :" + user.getUserName());
                    System.out.println("Password :" + user.getPassword());

                } catch (WeakPasswordException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
