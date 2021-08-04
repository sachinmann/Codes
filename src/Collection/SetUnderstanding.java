package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> st= new HashSet<>();
		
		
		
		//Collection is an interface and Set, List and Queue interfaces extends(Interfaces extends interfaces) Collection interface.
		//Set interface is implemented by HashSet, LinkedHashSet and TreeSet classes
		//List Interface is implemented by ArrayList, LinkedList and Vector
		//Linkedlist implements both List and queue Interfaces.
		
		//Map Interface is implemented by HashMap, LinkedHashMap, HashTable and treeMap classes
//*************************************************************************************************		
        //Set is implemented either HashSet, LinkedHashSet or TreeSet
        //Set does not allow duplicate values and does not maintain insertion order with the exception of LinkedHashSet
        //Null value is accepted by set, but it gonna be just one null value.	
		
        //Only difference btw HashSet and LinkedHashSet is LinkedHashSet maintains the insertion order, 
        //so when we have to remove duplicate and maintain insertion order from array...use linkedhashset		

		//Methods used in Set/HashSet/LinkedHashSet
//        add--- add elements one by one//returns true or false
//        addAll----Appends all the elements of any specific collection..used for union of two sets
//        contains--check if an element is present in set or not
//        clear---clears the set
//        Hashcode---returns the hashcode of set
//        isEmpty()---check if hashset is empty or not
//        remove--remove/delete specified element
//        retainAll----used for intersection of two sets
//        size()---returns the size of set.
        
	// Shortform to learn methods:	aaccrrhis and how to iterate in Set
		
		//Adding elements to set
		st.add("Sachin");   // This statement will return true if element is added successfully.
		st.add("Nitin");
		st.add("Neha");
		st.add("Sachin");
		st.add("Mahajan");
		
		System.out.println(st);
		
		boolean ct =st.contains("Mahajan");
		System.out.println("Contains method" + " " + ct);
		
		//Removing elements from set
		
		st.remove("Neha");
	
		
		System.out.println(st);
		
		//Iterate through set
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		//Iterate using iterator
		
		Iterator<String> it=st.iterator(); 
		while(it.hasNext())
		{
			System.out.println("set through iterator" + " " +it.next());
		}
		
		//Putting an array inside set/hashset or add many values in one go
		
//		Set<Integer> first= new HashSet<Integer>();
//		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7})); // Putting elements in one go from array 
//		
//		System.out.println("first "+ first);
//		
//		Set<Integer> second = new HashSet<Integer>();
//		second.addAll(Arrays.asList(new Integer[] {5,6,7,8,9}));
//		
//		Set<Integer> union = new HashSet<Integer>(first);   Here we are copying first set into union set.
//		
//		System.out.println("before union" +  union);
//		union.addAll(second);
//		System.out.println(union);
//		
//		System.out.println(first.addAll(second));  //It will print boolean
//		
//		Set<Integer> intersection = new HashSet<Integer>(first);
//		intersection.retainAll(second);
//		System.out.println(intersection);
//		
//		
//		Set<Integer> fourth= new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
//		System.out.println("forth" + fourth);
		
		Integer arr[] = new Integer[] {1,2,3,4,5};
		
		//Arrays.asList(Arrayname)...this is basically converting an array into list/arraylist and finally copying the list into Set
		
		//Interview Question: How to convert Array into Arraylist/List
		
		Set<Integer> first = new HashSet<Integer>(Arrays.asList(arr));
		
		
		Set<Integer> second = new HashSet<Integer>(Arrays.asList(new Integer[] {3,4,5,6,7,8,9}));
		
	
		//Union of above two sets
		
		Set<Integer> union= new HashSet<Integer>(first);
		union.addAll(second);
		
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(first); //this copies all elements of first into intersection
		intersection.retainAll(second);
		
		System.out.println(intersection);
		
		System.out.println(intersection.hashCode());
		System.out.println(intersection.isEmpty());
		System.out.println(intersection.size());
		
		
		}
		
	}


