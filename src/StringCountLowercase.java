public class StringCountLowercase {

    public static void main(String[] args) {
        String line="This website is awesome";
        int lowerCase=0;

        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if((ch>='a'&&ch<='z')){
                lowerCase++;
            }
        }
        System.out.println("lower case count is "+lowerCase);
    }
}
