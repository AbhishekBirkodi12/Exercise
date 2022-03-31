public class StringCountUpperCase {
    public static void main(String[] args) {
        String line="This website is awesome";
        int upperCase=0;

        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if((ch>='A'&&ch<='Z')){
                upperCase++;
            }
        }
        System.out.println("Upper case count is "+upperCase);
    }

}
