package NaveenAutomationJava;


//How to Reverse a String - Java Interview Question -1

//Tip: Wrapper classes such as Integer, Double, Float, Long are also immutable and final like String
//Why string is immutable- for security purpose of program like
//String s1= "USA";
//String s2= "USA";
// s2="Canada";...here initially both S1 snd S2 were pointing to USA, now s2 changed its pointer and 
//created new object in pool with canada, however s1 will still point to USA, if string are 
// mutable, s1 will also start pointing to Canada, which should not be the case

//Only differce btw stringbuffer and stringbuilder is former is thread safe (will take more time to execute) and later is not.

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Selenium";
		String reverse ="";

		//There is no reverse method in string as string is immutable object.
		
	    for(int i= str.length()-1; i>=0; i--)
	    {
	    	//System.out.println("Reversed string is " + " "+ str.charAt(i));
	    	//System.out.print(str.charAt(i));
	    	reverse = reverse + str.charAt(i);
	    }
	    
	    System.out.println("Reversed string is" + " " + reverse);

	    
	    //Using stringBuffer
	    StringBuffer sb = new StringBuffer(str);
	    StringBuffer s= sb.reverse();
	    System.out.println(s);
	    
	}

}
