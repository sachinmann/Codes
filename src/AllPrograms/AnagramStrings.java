 package AllPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="adcb";
		String s2="dcab";
		
		char[] ch1= s1.toCharArray();
		char[] ch2= s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(ch1); System.out.println(ch2);
		
	boolean b=	Arrays.equals(ch1, ch2);
	
//Arrays.equals(Array1, array2) method compares the content of two array and 1 to 1 element comparison
	
	          System.out.println(ch1.equals(ch2));
	
	if(b== true)
	{
		System.out.println("Strings are anagrams");
	}
	
	else
	{
		System.out.println("Strings are not anagrams");
	}
		
	}

}
