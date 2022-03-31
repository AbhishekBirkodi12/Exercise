public class StringRemoveAllSpaces {
    public static void main(String[] args) {
        String a="abc for technology";
        System.out.println("Before removing spaces "+a);
        String b=a.replaceAll("\\s","");
        System.out.println("After removing spaces "+b);
    }
}
