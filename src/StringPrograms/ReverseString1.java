package StringPrograms;

public class ReverseString1
{

	public static void main(String[] args)
	{
		String str = new String ("aabbbcccc");
		 
		
		 //Method 1
//		 char[] chr= str.toCharArray();
//		 System.out.println(chr);
//		 
//		 for(int i=chr.length-1 ; i>=0; i--)
//		 {
//			 System.out.print(chr[i]);
//		 }
//		 
		 
		 //Method 2
		 //String class does not have reverse() method, we convert into stringBuffer
//		 
//		 StringBuffer sb = new StringBuffer(str);
//		 System.out.println(sb);
//		 sb.reverse();
//		 System.out.println(sb);
		 
		 //Method 3
		 
		 StringBuilder sbu = new StringBuilder();
		 sbu.append(str);
		 System.out.println(sbu);
		 sbu.reverse();
		 System.out.println(sbu);
	}
	
}