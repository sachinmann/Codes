		package Collection;
		
		import java.util.ArrayList;
		import java.util.List;
		
		public class ListUnderstanding {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		//Only difference btw list and set is, list allows duplicate values and always maintain insertion order..
				//List is of three types..ArrayList, LinkedList and vector
				List<String> ls = new ArrayList<>();
				
				ls.add("India");
				ls.add("China");
				ls.add("India");
				ls.add("USA");
				
				System.out.println(ls);
				
				for(String s: ls)
				{
					System.out.println(s);
				}
				
				ls.remove("India");
				System.out.println(ls);
				
				
				//Get AND set method in list
				
					String listReturn=	ls.get(0);
					System.out.println(listReturn);
					
			    // Set method is to update any element in a list
					
					ls.set(1,"Brazil");
					
					System.out.println(ls);
				
				
				
			}
		
		}
