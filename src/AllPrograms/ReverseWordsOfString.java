package AllPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str= new String("United States of America");
//		
//		String arr[] = str.split(" ");
//		
//		String rev="";
//		String rev1= "";
//		
//		
//		for(String s: arr)
//		{
//			for(int i=s.length()-1 ; i>=0; i--)
//			{
//				rev= rev + s.charAt(i);
//				
//			}
//			rev1=rev1 + rev + " ";
//			
//		}
		//System.out.println(rev1);
		String inputString= "Java Concept Of The Day";
		String[] words = inputString.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
		
		
		
	}

}
