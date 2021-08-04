package StringProgams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("MynameisSachin");
		char[] charr= str.toCharArray();
		
		System.out.println("Arrays is" + Arrays.toString(charr));
		
		//Define a hashmap
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		//Fill keys from array
		 for(char ch: charr)
		 {
			 if(hmap.containsKey(ch))
			 {
				 hmap.put(ch, hmap.get(ch)+1);
			 }
			 else
			 {
				 hmap.put(ch, 1);
			 }
		 }
		 
		 System.out.println(hmap);
		// Now iterate through Hashmap
		 
		 Set<Map.Entry<Character, Integer>> eset = hmap.entrySet();
		 
		 System.out.println(eset);
		 
		 
		 for(Map.Entry<Character, Integer> e:eset)
		 {
			 if(e.getValue()>1)
			 {
				 System.out.println("Duplicate characters are " +  e.getKey());
			 }
		 }
		 

	}

}
