package NaveenAutomationJava;

public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Hello";
		String b ="Worlddddddd";
		
		System.out.println("Strings before swapping" + " a = " + a );
		System.out.println("Strings before swapping" + " b = " + b );
		
	    a=a.concat(b);
	    
	    System.out.println("a is "+  a);
	    
	    System.out.println(a.length());
	    
	    b=a.substring(0, a.length()-b.length());
	    a=a.substring(b.length(), a.length());
	
	  
	    System.out.println("After swap a is " + a);
	    
	   
	    
	    System.out.println("After swap b is " + b);

	}

}
