public class StringSpecialCharacterCount {
    public static void main(String[] args) {
        String s="Welcome to @#$^& ABC";
        int specialCharacters=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>=33&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=126)){
                specialCharacters++;
            }
        }
        System.out.println("Special character count is "+specialCharacters);
    }
}
