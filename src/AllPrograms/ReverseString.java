package AllPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString rs = new ReverseString();
		rs.revString("My name is Sachin");
		
	}
	
	public void revString(String str)
	
	{
		String reverse= "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse= reverse + str.charAt(i);
		}
		
		System.out.println("Reversed string is" + " "+ reverse);
	
	}
}
