package StringProgams;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//firstCharacter("human");
		
		FirstNonRepeatedCharacter f = new FirstNonRepeatedCharacter();
		f.firstCharacter("Human");
	}
	
	public void firstCharacter(String s)
	{
	
		char[] chr= s.toCharArray();
		
		HashMap<Character,Integer> hmap= new HashMap<>();
		for(char c: chr) 
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
		
		//Since Hashmap doesnot maintain insertion order, loop through array again
		
		for(char ch: chr)
		{
			if(hmap.get(ch)==1)
			{
				System.out.println(ch);
			}
			break;
		}

		}
	}
