public class StringNumberCount {
    public static void main(String[] args) {
        String s="abc123";
        int number=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                number++;
            }

        }
        System.out.println(number);
    }
}
