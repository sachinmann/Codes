package NaveenAutomationJava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		System.out.println(prime(19));
      	
	}
		
		public static boolean prime(int num)
		{
			
		
		for(int i=2 ; i<num; i++)
		{
			if(num % i == 0)
			{
				return false;	
			}
			
		}
			return true;
		
		
	}

	
}
