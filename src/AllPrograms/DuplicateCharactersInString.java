package AllPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCharactersInString dc= new DuplicateCharactersInString();
		dc.duplicateString("beautiful");

	}
	
//	Method 1 by loop
//	public void dupliString(String str)
//		{
//			
//		//char ch[] = str.toCharArray();
//		//System.out.println(ch);
//		
//		for(int i=0; i< str.length(); i++ )
//		{
//			for(int j=i+1; j<str.length(); j++)
//			{
//				
//				if(str.charAt(i)== str.charAt(j))
//				{
//					System.out.println("Duplicate Character is "+ " "+ str.charAt(i) );
//					break;
//				}
//			}
//		}
	
	public void duplicateString(String str)
	{
		
		Map<Character,Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(hmap.containsKey(str.charAt(i)))
			{
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
			}
			
			else
			{
				hmap.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(hmap);
		
		
		Set<Entry<Character,Integer>> eset= hmap.entrySet();
		
		System.out.println("Entry Set is" +" "+ eset);
		
		for(Entry<Character, Integer> e: eset)
		{
			if(e.getValue()>1)
				
			{
				System.out.println("Duplicate Character is " + e.getKey());
			}
		}
//		
	}
		
	}


