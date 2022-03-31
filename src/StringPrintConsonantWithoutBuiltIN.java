public class StringPrintConsonantWithoutBuiltIN {
    public static void main(String[] args) {
        String s="Abc For technology";
        int vowels=0;

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||((ch>='A'&&ch<='Z'))){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    System.out.print(ch);
                }
            }
        }

    }

}
