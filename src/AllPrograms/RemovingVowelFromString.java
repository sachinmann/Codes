package AllPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingVowelFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sachin";
		
		char[] arr1=str.toCharArray();
		
		ArrayList<Character> al1= new ArrayList<Character>();
		
		//Convert array into arraylist
		for(char c:arr1)
		{
			al1.add(c);
		}
		
		System.out.println(al1);
		
		char[] arr2 = {'a','e','i','o','u'};
		
		for(char c: al1)
		{
			
			for(int i=0; i<arr2.length ;i++)
			{
				
				if(c==arr2[i]) 
				{
				al1.remove(c);
				break;
				}
			}
			
		}
		
		System.out.println(al1);
				
		

	}

}
