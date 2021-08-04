package StringPrograms;

import java.util.HashMap;

public class FirstNonRepeatedCharacter1 {

	public static void main(String[] args)
	{
		String str= new String("HHuman");
		char[] chr= str.toCharArray();// Converted to character array
		//Now fill characters in Hashmap
		
		HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
		
		for(char c: chr)
		{
			System.out.println("value of c" + " " + c);
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
				
			}
		}
		
		System.out.println(hmap);
		//hmap.getOrDefault(arg0, arg1)   Learn about this.
		
		for(char c: chr)
		{
			if(hmap.get(c)==1)
			{
				System.out.println("First Non repeated value is" + " "+ c);
				break;
			}
			
			
		}
		
		System.out.println("Program completed");
		
		
	}
}
