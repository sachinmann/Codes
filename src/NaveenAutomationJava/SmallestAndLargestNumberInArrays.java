package NaveenAutomationJava;

public class SmallestAndLargestNumberInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,8,1,89,34};
		int largest=0;
		int smallest =0;
		
		for(int i:arr)
		{
			if(i>largest)
			{
				largest=i;
			}
			else if(i<smallest)        
			{
				smallest=i;
			}
		}
		
		System.out.println(largest +" "+ smallest);

	}

}
