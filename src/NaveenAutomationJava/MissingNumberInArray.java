package NaveenAutomationJava;

public class MissingNumberInArray {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,7,8,9,10};
		int size=0;
		for(int i=0; i<arr.length; i++)
		{
			size = size + arr[i];
		}
		
		System.out.println("Sum of all array elements" + size);

		int n= arr.length +1;
		System.out.println(n);
		
		int sum1=n*(n+1)/2;
		int missedNumber= sum1-size;
		
		System.out.println(missedNumber);
		
	}

}
