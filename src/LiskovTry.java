import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class LiskovTry {
    static void friend() throws FileNotFoundException{
        System.out.println("Friend");
    }

}
class LiskovTry1 extends LiskovTry{
    static void friend() throws ArrayIndexOutOfBoundsException {
        System.out.println();
    }
}
