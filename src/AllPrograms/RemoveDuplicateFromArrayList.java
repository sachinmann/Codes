package AllPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,6));
		 
		 System.out.println(al1);
		 
		 Set<Integer> s= new LinkedHashSet<Integer>(al1);
		 
		 System.out.println(s);
		 
		 ArrayList<Integer> al2 = new ArrayList<Integer>(s);
		 
		 System.out.println(al2);
		 

	}

}
