package StringProgams;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Sachin";
		String s2= "Sachin";
		String s3= new String("Nitin");
		String s4 = new String("Nitin");
		
		boolean result= s3==s4;
		System.out.println(result);
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		
		String S ="America";
		System.out.println(S);
		
		// CharAt method
		char ch = S.charAt(5);
		System.out.println("The character at 5th Position is " + ch);
		
		//Length Method
		
		int l = S.length();
		System.out.println("The length is " + l);
		
		// Substring Method
		
		String sub =S.substring(2);
		System.out.println(sub);
		
		String sub1=S.substring(2, 6);
		System.out.println(sub1);
		
		//Contains Method
		
		boolean b=S.contains("m");
		System.out.println(b);
		
		//Split method
		
		//Concat Method
		
		String S1= "United";
		String S2 ="States of";
		
		String S3=S1.concat(S2).concat(S);
		System.out.println(S3);
		
		String str="%&^%^$#%^# sachin is &^&(^(&&^( great";
		
		str=str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("new string is" + " "+  str);

	}

}
