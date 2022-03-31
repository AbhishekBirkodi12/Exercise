public class StringPrintUpperCaseAlphabetsWithoutUsingBuiltIn {

    public static void main(String[] args) {
        String s="Abc For Technology";

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')){
                System.out.print(ch);

            }
        }

    }

}
