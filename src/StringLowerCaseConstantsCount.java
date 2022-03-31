public class StringLowerCaseConstantsCount {
    public static void main(String[] args) {
        String s="Abc For technology";
        int vowels=0;
        int consonant=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')){

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("Total number of lowercase constants  are: "+consonant);
    }

}
