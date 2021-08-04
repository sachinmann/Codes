package StringPrograms;

import StringProgams.ReverseString;

public class ReverseEachWordOfString1 {

	public static void main(String[] args)
	{
		reverseEach("This Is United States Of America");
	}
	
	public static void reverseEach(String x)
	{
		
		String[] strarr = x.split(" ");
	 // System.out.println("Split string array is" + strarr.toString());
		
		for(String s: strarr)
		{
			String reverseString = "";
			for(int i = s.length()-1 ; i>=0; i--)
			{
			     reverseString= reverseString + s.charAt(i);
			     
			     
			}
			
			System.out.print(reverseString + " ");
		}
	}
	
	
}
