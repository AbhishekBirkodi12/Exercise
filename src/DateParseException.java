import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateParseException {
    public static void main(String[] args) throws ParseException {
        try {
            Scanner scanner = new Scanner(System.in);
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
            System.out.println("Enter the stage event start date and end date");
            String StartDate = scanner.next();
            String EndDate = scanner.next();

            Date DateStart = dateFormat.parse(StartDate);
            Date DateEnd = dateFormat.parse(EndDate);
            System.out.println("Start Date :" + DateStart);
            System.out.println("End Date :" + DateEnd);
        } catch (ParseException e) {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'" +
                    "");
        }

    }
}
