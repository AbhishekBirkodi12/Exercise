public class StringRemoveVowels {
    public static void main(String[] args) {
        String a="abc for technology    ";
        System.out.println("Before removing vowels "+a);
        String b=a.replaceAll("[AaIiOoUu]","");
        System.out.println("After removing vowels "+b);
    }

}
