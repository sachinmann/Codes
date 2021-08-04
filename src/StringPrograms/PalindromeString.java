package StringPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		//String str ="Levil";
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
		String reverseString="";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverseString= reverseString + str.charAt(i);
			
		}
		
		System.out.println(reverseString);
		
		if(str.equals(reverseString))
		{
			System.out.println("String is palindrome");
		}
		
		else
		{
			System.out.println("String is not palindrome");
		}
		
//		
//		StringBuffer sb= new StringBuffer(str);
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//		sb.toString();
//		
//		if(sb.equals(str))
//		{
//			System.out.println("String is palindrome");
//		}
//		
//		else {
//			System.out.println("String is not palindrome");
//		}
//	      }
	
		
		Scanner ss = new Scanner(System.in);
		String str1= ss.nextLine();
}
}
