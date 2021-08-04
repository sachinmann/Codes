package StringProgams;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss="";
		String str ="United States Of America";
		
		Set<Character> s= new LinkedHashSet<Character>();
		
		for(int i= 0; i<str.length(); i++)
		{
			s.add(str.charAt(i));
		}
		
		System.out.println(s);
		
		for(Character c: s)
		{
			ss =ss + c;
		}
		
		System.out.println(ss);
		
		
		
	}

}
