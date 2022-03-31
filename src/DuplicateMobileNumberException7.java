import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class DuplicateMobileNumberException7 extends Exception {
    public DuplicateMobileNumberException7(String s) {
        super(s);
    }

}

class ContactDetail {
    private String mobile;
    private String alternateMobile;private String landLine;
    private String email;
    private String address;

    public ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address) {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

class ContactDetailBo {
    public void validate( String mobile, String alternateMobile) throws DuplicateMobileNumberException7 {
        if (mobile.equals(alternateMobile)) {
            throw new DuplicateMobileNumberException7("DuplicateMobileNumberException: Mobile number and alternate mobile number are same");
        }

    }
}

class MainDuplicateNumberException {
    public static void main(String[] args) throws DuplicateMobileNumberException7 {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the contact details");
        System.out.println("Enter the mobile number");

        String mobile = scanner.next();
        System.out.println("Enter the alternate mobile number");
        String alternateMobile = scanner.next();
        System.out.println("Enter the landline number");
        String landLine = scanner.next();
        System.out.println("Enter the email id");
        String email = scanner.next();
        System.out.println("Enter the address");
        String address = scanner.next();
        ContactDetail contactDetail = new ContactDetail(mobile, alternateMobile, landLine, email, address);
        ContactDetailBo contactDetailBo = new ContactDetailBo();
        try {
            contactDetailBo.validate(mobile, alternateMobile);
            System.out.println("Mobile :" + contactDetail.getMobile());
            System.out.println("Alternate mobile :" + contactDetail.getAlternateMobile());
            System.out.println("Landline :" + contactDetail.getLandLine());
            System.out.println("Email :" + contactDetail.getEmail());
            System.out.println("Address :" + contactDetail.getAddress());
        } catch (DuplicateMobileNumberException7 d) {
            System.out.println(d.getMessage());
        }

    }
}
