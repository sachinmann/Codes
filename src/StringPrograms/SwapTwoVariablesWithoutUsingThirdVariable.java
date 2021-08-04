package StringPrograms;

public class SwapTwoVariablesWithoutUsingThirdVariable {

	public static void main(String[] args)
	{
		
	
	int a = 50;
	int b = 60;
	
	System.out.println("Before swap a is " + a + " " + "Before swap b is " + b);

	a= b + a;   
	b= a - b; 
	a= a - b;   
	
	System.out.println("After swap a is " + a + " " + "After swap b is " + b);
	}
}
