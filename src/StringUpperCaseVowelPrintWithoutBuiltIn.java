public class StringUpperCaseVowelPrintWithoutBuiltIn {

    public static void main(String[] args) {
        String s="Abc For technology";
        int vowels=0;
        int consonant=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')){

                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    System.out.print(ch);
                }else{
                    consonant++;
                }
            }
        }

    }

}