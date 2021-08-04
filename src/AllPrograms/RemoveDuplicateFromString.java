package AllPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
        String str = sc.nextLine();
		
		char[] ch= str.toCharArray();
		
	Set<Character> st= new LinkedHashSet<Character>();
	
	
	System.out.println(st);
	
	for(char c: ch)
	{
		st.add(c);
		
	}
	
	System.out.println(st);
	
	//Now, iterate the set
	for(char c: st)
	{
		System.out.print(c);
	}
		
		
	}

}
