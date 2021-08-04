package StringProgams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="United States Of America";
		char[] chr= str.toCharArray();
		HashMap<Character,Integer> hmap= new HashMap<>();
		
		for(char c:chr)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c,hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		
		System.out.println(hmap);
		Set<Entry<Character, Integer>> entry= hmap.entrySet();
		
		Iterator<Map.Entry<Character, Integer>> i = entry.iterator();
		while(i.hasNext())
		{
		    Entry<Character, Integer> element = i.next();
		    if(element.getValue()>1)
		    {
		    System.out.println("Key: "+element.getKey()+" ,value: "+element.getValue());
		    i.remove();
		    }
		}
		
		System.out.println(hmap);
		/*for(Entry<Character, Integer> e: entry)
		{
			if(e.getValue()>1)
			{
				
				
				char k=e.getKey();
				System.out.println(k);
				//Integer returned_value = (Integer)hmap.remove(k);
				
			}
			
			System.out.println(hmap);
		}
		*/
			}

	}
