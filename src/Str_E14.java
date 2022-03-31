
import java.util.Scanner;

public class Str_E14 {
	private static Scanner s;
	static String replaceSpaces(String L) 
	{
		String s="";
		for(int i=0;i<L.length();i++) {
			if(L.charAt(i)==' ') 
				s+="ABC";
			else
				s+=L.charAt(i);	
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
