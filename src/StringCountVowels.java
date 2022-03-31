class StringCountVowels{
    public static void main(String[] args) {
        String line="This website is awesome";
        int vowels=0;
        line=line.toLowerCase();
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
                vowels++;
            }
        }
        System.out.println("Vowel count is "+vowels);
    }
}