package StringPrograms;

import java.util.Arrays;

public class AnagramsStrings1 {

	public static void main(String[] args)
	{
	String s1= "abc";
	String s2= "acb";
	
	
	//Anagram means that both strings has equal number of same characters.
	//sort the string first
	
	char[] c1= s1.toCharArray();
	char[] c2= s2.toCharArray();
	
	System.out.println(c1);
	
	//Now sort the arrays
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	boolean res= c1.equals(c2);
	System.out.println(res);
	
   //Compare arrays:
	
	//Method to compare arrays.
	
	//Arrays.equals(Array1, Array2)...This will check the contents of two arrays.
	
	if(Arrays.equals(c1, c2))
	
	{
		System.out.println("Strings are anagrams");
	}
	
	else
	{
		System.out.println("Strings are not anagrams");
	}
	
	}
}
