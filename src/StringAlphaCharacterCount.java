public class StringAlphaCharacterCount {

    public static void main(String[] args) {
        String s="Abc For technology";
        int alphaCharacter=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||((ch>='A'&&ch<='Z'))){
                alphaCharacter++;

            }
        }
        System.out.println("Total number of alphaCharacter is: "+alphaCharacter);
    }

}
