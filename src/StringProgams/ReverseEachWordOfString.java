package StringProgams;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is sachin";
		String[] arrstr=str.split(" ");
//		for(String ch: arrstr)
//		{
//			System.out.print(ch);
//		}
		
		for(int i=arrstr.length-1;i>=0; i--)
		{
			System.out.print(arrstr[i]+" ");
		}
		

	}

}
