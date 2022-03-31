public class StringCountExtraSpaces {
    public static void main(String[] args) {
        String s="  Hello  ";
        int scount=s.length();
        //Leading spaces count
        String leadingCount=s.replaceAll("^\\s+","");
        int finalLeadingcount=(scount-leadingCount.length());
        System.out.println("Spaces at the beginning are :"+(finalLeadingcount));
        String trailingSpaceCount=s.replaceAll("\\s+$","");
        int finalTrailingCount=(scount-trailingSpaceCount.length());
        System.out.println("Spaces at the end are :"+finalTrailingCount);
        int totalSpaceCount=finalLeadingcount+finalTrailingCount;
        System.out.println("Total count of the extra spaces are : "+totalSpaceCount);
    }
}
