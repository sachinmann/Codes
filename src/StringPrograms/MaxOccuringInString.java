package StringPrograms;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MaxOccuringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "aabbbcccc";
		char[] chr = str.toCharArray();
		
		HashMap<Character, Integer> hmap1= new HashMap<Character, Integer>();
		
		for(char c : chr)
		{
			if(hmap1.containsKey(c))
			{
				hmap1.put(c, hmap1.get(c)+1);
				
			}
			else
			{
				hmap1.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> eset = hmap1.entrySet();
		
		int maxcount = 0;
		char maxkey  = 0;
		
		
		
		for(Entry<Character, Integer> e : eset)
		{
			if(e.getValue() > maxcount)
			{
				maxcount=e.getValue();
				maxkey=e.getKey();
			}
			
			
		}
		System.out.println(maxkey);
		System.out.println("maxvalue is" + maxcount);
		
		
		
	}

}
