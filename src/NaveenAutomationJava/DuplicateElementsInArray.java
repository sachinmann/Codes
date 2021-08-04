package NaveenAutomationJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {11,12,13,14,15,16,11,12,12};
				
		//Tip:Arrays.equals(array1, array2) is used to compare two arrays.
		
		//Method 1
		
		for(int i=0 ; i<arr.length-1; i++)
		{
			
			for(int j= i+1; j< arr.length-1 ; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate elements are" + arr[i]);
				}
			}
		}
		
		
		//Method 2
		
		HashMap<Integer, Integer> hmap= new HashMap<Integer, Integer>();
		
		for(int i: arr)
		{
			if(hmap.containsKey(i))
			{
				hmap.put(i, hmap.get(i)+1);
			}
			
			else
			{
				hmap.put(i, 1);
			}
		}
		
		System.out.println("Hashmap is" + hmap);
		
		
		//Now we have to iterate in hashmap by converting it to entryset
		
		Set<Entry<Integer, Integer>> eset= hmap.entrySet();
		
		
		System.out.println(eset);
		
		for(Entry<Integer, Integer> e: eset)
		{
			if(e.getValue() >1)
			{
				System.out.println(" Duplicate elements in arrays are" + " "+ e.getKey());
			}
			
		}
		
		
		//Method 3
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr)
		{
			set.add(i);
			
			if(set.add(i) == false)
			{
				System.out.println("Duplicate element via set technique is" + " "+ i);
			}
		}
		System.out.println(set);
		
		
		
		//This was I converted array into set
		
		
		
		
		
		
		
	}

}
