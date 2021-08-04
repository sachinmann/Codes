package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Arraylist is dynamic array to store elements and size increases as per the requirements. 
		//However, initial virtual capacity is 10 and as soon as we are close to size, it increases the size.
		//If we want to increase the Virtual capacity of arraylist then we can specifiy while declaring arraylist
		//ArrayList<Integer> al= new ArrayList<Integer>(20);
		//By default virtual size of an arraylist is 10
		// Its manipulation is lil slower than LL because lot of shiftinh happensif elements are removed from in btw.
		//Methods in arraylist
	//	add
//		addAll
//		addAll with index
//		contains
//		clear
//		clone
//		remove
//		removeif
//		retain all
//		get(index)
//		set()   to update element at a particular index
//		sort
//		size()
		
		//aaacccrrr 
		
	//	aaccgrrhis
//**********************************************************************************************************		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		// Integer above is called generic and wrapper class of int.
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		//Printing entire array list
		
		System.out.println("First Arraylist is "+ " "+ al1);
//****************************************************************************************************		
		//Creating arrayList in one go
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {60,70,80}));
		
		//Printing size of arraylist
		
		System.out.println("Second Arraylist is "+ " "+ al2);
		
		System.out.println("Size is" +" "+ al2.size());
//****************************************************************************************************				
	
	//	Appending second Arrayslist to first arraylist
		
		al1.addAll(al2);
		
		System.out.println("First ArrayList is " + al1);
		
		al1.addAll(3, al2);
		
		System.out.println("First ArrayList aafter appending with second araylist at a particular index is " + al1);
		
		//****************************************************************************************************			
		
		//Retrieving elements of arraylist
		
		
		System.out.println("element at 1st index is"  +" "+ al2.get(1));
	
//		//Iterating arraylist
//		System.out.println("********************************");
		
		//We can iterate through normal for loop as well because Arraylist has get(index) method.
//		
		for(int i=0; i<=al1.size()-1 ;i++)
		{
			System.out.println("element through for loop is"  +" "+ al1.get(i));
		}
//		
//		// Iterating through for each
//		
//		System.out.println("********************************");
		for(int i: al1)
		{
			System.out.println("element through for each loop is"  +" "+i);
		}
//		
//		//Iterating through while loop
//		System.out.println("********************************");
//		
		Iterator<Integer> it= al2.iterator();
		while(it.hasNext())
		{
			System.out.println("Elements through iterator" + " "+ it.next());
			
		}

		// Sorting ArrayList
		Collections.sort(al2);
		System.out.println("Second Arraylist after sorting is "+ " "+ al2);
		
		
		//Comparing two arraylist
		//Arraylist1.equals(ArrayList2);
		
	}

}
