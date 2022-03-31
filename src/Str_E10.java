
import java.util.Scanner;

public class Str_E10 {
	private static Scanner s;
	static String replaceSpaces(String L) 
	{
		String s="";
		for(int i=0;i<L.length();i++) 
		{
			if(L.charAt(i)=='a'||L.charAt(i)=='e'||L.charAt(i)=='i'||
			  L.charAt(i)=='o'||L.charAt(i)=='u'||L.charAt(i)=='A'||L.charAt(i)=='E'
			  ||L.charAt(i)=='I'||L.charAt(i)=='O'||L.charAt(i)=='U') 
			{	
				s+=L.charAt(i);
				
			}
			else if(L.charAt(i)>='A'&&L.charAt(i)<='Z')
				s+="ABC";	
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String to check");
		s = new Scanner(System.in);
		String L=s.nextLine();
		System.out.println(replaceSpaces(L));
		
	}
}
