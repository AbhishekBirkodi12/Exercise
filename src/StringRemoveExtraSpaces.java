public class StringRemoveExtraSpaces {
    public static void main(String[] args) {
        String a="     abc for technology    ";
        System.out.println("Before removing extra spaces"+a);
        String b=a.trim();
        System.out.println("After removing extra spaces "+b);
    }
}
