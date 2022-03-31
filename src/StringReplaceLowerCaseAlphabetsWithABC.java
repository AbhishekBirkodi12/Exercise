public class StringReplaceLowerCaseAlphabetsWithABC {

    public static void main(String[] args) {
        String a="Abc For Technology    ";
        System.out.println("Before removing lower case "+a);
        String b=a.replaceAll("[a-z]","ABC");
        System.out.println("After removing lowercase "+b);
    }

}

