public class StringPrintLowerCaseAlphabetsWithoutUsingBuiltIn {
    public static void main(String[] args) {
        String s="Abc For Technology";

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')){
                System.out.print(ch);

            }
        }

    }

}
