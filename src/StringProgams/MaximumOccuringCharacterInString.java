package StringProgams;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccuringCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  new String("amerrrica");
		char[] chr = str.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<>();
		
		for(char c : chr)
		{
			System.out.println(c);
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
		
		//Now traverse through Hashmap
		
		Set<Entry<Character,Integer>> entryset = hmap.entrySet();
		
		for(Entry<Character,Integer> entry: entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
