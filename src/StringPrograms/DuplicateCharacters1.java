package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class DuplicateCharacters1 {

	
	public static void main(String[] args)
	{
		String str = new String("AmericAm");
	//String str1=	str.toLowerCase();
		char[] chr= str.toCharArray();
		//System.out.println(str1);
		System.out.println(chr);
		
		
		HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
		for(int i=0; i<chr.length; i++)
		{
			if(hmap.containsKey(chr[i]))
			{
				hmap.put(chr[i], hmap.get(chr[i])+1);
			}
			
			else
			{
				hmap.put(chr[i], 1);
			}
		}
		
		System.out.println(hmap);
		
		
		//Iterate through Hashmap
	
		//Method 1- Converting hashmap into corresponding entryset, reason of converting is because there is no direct iteration method available to iterate through hashmap
		
	Set<Map.Entry<Character, Integer>> hset	=hmap.entrySet();
	System.out.println("--------------");
	System.out.println(hset);
	
	//Iterator<Entry<Character, Integer>> it = hmap.entrySet().iterator();
	 //Iterator<Entry<Character, Integer>> it= hset.iterator();
	 
	for(Map.Entry<Character, Integer> e: hset)
	{
		//System.out.println(e);
		if(e.getValue()>1)
		{
			System.out.println("Duplicate character is" +" "+ e.getKey());
		}
	}
	
	}
}
