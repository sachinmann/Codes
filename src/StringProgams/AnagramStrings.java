package StringProgams;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "army";
		String s2= "mary";
		
		char[] ch1= s1.toCharArray();
		char[] ch2= s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	//Note: Arrays cant be printed like this as below.
	//System.out.println("sorted arrays are " + ch1.toString() + " and " + ch2.toString());
	
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
		
	}

}
