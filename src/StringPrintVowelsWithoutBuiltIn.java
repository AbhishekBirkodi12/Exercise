public class StringPrintVowelsWithoutBuiltIn {
    public static void main(String[] args) {
        String line="Abdevilliers";
        int vowels=0;

        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
                System.out.print(ch);
            }
        }

    }
}
