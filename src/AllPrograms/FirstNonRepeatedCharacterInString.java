package AllPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("ammerica");
		
//		for(int i =0; i<str.length() ; i++)
//		{
//			
//			for(int j=i+1; j< str.length(); j++)
//			{
//				if(str.charAt(i)!=str.charAt(j))
//				{
//					System.out.println("First non repetitive characeter is " + " "+ str.charAt(i));
//					break;
//					
//				}
//			}
//			
//		}
		
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		System.out.println(hmap);
		
		for(int i =0; i<str.length() ; i++)
		{
			if(hmap.containsKey(str.charAt(i)))
			{
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
			}
			else
			{
				hmap.put(str.charAt(i),1);
			}
		}
		
		System.out.println(hmap);
		
		
		for(int j=0; j<str.length(); j++)
		{
			if(hmap.get(str.charAt(j))==1) 
			{
			System.out.println(str.charAt(j));
			break;
			}
			
		}
		
	}

}
