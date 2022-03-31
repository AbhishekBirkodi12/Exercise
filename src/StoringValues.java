import java.util.Scanner;

public class StoringValues {

    public static void main(String args[]) {
        int a = 25;
        float b = (float) 3.12;
        byte c = 120;
        double d = 120.8979654;
        boolean e = true;
        char f = 'A';
        short g = 195;
        long h = 464688;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


        System.out.println("Enter an integer value");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("Enter an byte value");
        byte j = scanner.nextByte();
        System.out.println("Enter an short value");
        short k = scanner.nextShort();
        System.out.println("Enter an long value");
        long l = scanner.nextLong();
        System.out.println("Enter an float value");
        float m = scanner.nextFloat();
        System.out.println("Enter an Double value");
        double n = scanner.nextDouble();

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);


    }
}
