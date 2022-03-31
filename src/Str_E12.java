
import java.util.Scanner;

public class Str_E12 {
	private static Scanner s;
	static String replaceSpaces(String L) 
	{
		String s="";
		for(int i=0;i<L.length();i++) 
		{
			 if(L.charAt(i)>='a'&&L.charAt(i)<='z')
				s+="ABC";	
			 if(L.charAt(i)>='A'&&L.charAt(i)<='Z')
					s+="ABC";
			 if(L.charAt(i)>='0'&&L.charAt(i)<='9')
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
