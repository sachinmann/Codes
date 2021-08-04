package StringProgams;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "United States Of America";
		
	//	Any characater would be duplicate with Hashmap value greater than 2
		
		char[] chr = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(char c:chr) 
		{
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
		
		Set<Entry<Character,Integer>> entry = hmap.entrySet();
		
		System.out.println(entry);
		
		for(Entry<Character,Integer> e:entry)
		{
			if(e.getValue()>1)
			{
				System.out.println("Duplicate characters are"+" "+e.getKey()+" "+"And count is"+ " "+ e.getValue());
			}
		}

	}

}
