public class StringRemoveUpperCases {
    public static void main(String[] args) {
        String a="Abc For Technology    ";
        System.out.println("Before removing lower case "+a);
        String b=a.replaceAll("[A-Z]","");
        System.out.println("After removing lowercase "+b);
    }

}
