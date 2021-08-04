package NaveenAutomationJava;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 1234567;
		//Convert int to string
		
		String str= Integer.toString(x);
		System.out.println(x);
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println("Reversed integer is" +" "+ sb);

	}

}
