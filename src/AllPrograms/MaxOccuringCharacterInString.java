package AllPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "canadda";
		System.out.println(str);
		
		char ch[] =str.toCharArray();
		
		System.out.println(ch);
		
		Map<Character, Integer> hmap= new HashMap<Character, Integer>();
		
		for(char c: ch)
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
		
		//Now to iterate, lets introduce entryset of hashmap
		
		Set<Entry<Character, Integer>> eset= hmap.entrySet();
		
		
		System.out.println(eset);
		
		int maxvalue=0;
		char maxkey= '\u0000';
		
		for(Entry<Character, Integer> e: eset)
		{
			if(e.getValue()>maxvalue)
			{
				maxvalue=e.getValue();
				maxkey=e.getKey();
			}
			
			
		}
		System.out.println(maxkey + " "+ maxvalue);
		
	}

}
