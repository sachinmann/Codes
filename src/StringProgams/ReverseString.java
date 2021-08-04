package StringProgams;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="My name is sachin";
		//convert string into character array
		
		char[] arr= str.toCharArray();
		
		System.out.println(arr);
		
		for(int i =arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
		
		String str1 ="sachin";
		//method 1
		
		char[] chr= str1.toCharArray();
		for(int i=chr.length-1; i>=0; i--)
		{
			System.out.print(chr[i]);
		}
	}

}
