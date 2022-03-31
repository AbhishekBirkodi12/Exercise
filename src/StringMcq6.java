import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringMcq6 {
    public static void main(String[] args) throws ParseException {
        Date d;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        d=sdf.parse("45-03-2018");
        System.out.println(sdf.format(d));



    }
}
