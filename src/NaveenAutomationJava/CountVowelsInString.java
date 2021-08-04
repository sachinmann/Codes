package NaveenAutomationJava;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "alice";
		char[] ch=str.toCharArray();
		
		char[] vowarr= {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println(vowarr);
		int countvow=0;
		
		for(char c:ch)
		{
			for(int i=0; i<vowarr.length;i++)
			{
				if(c==vowarr[i])
				{
					countvow= countvow+1;
					
				}
			}
		}
		
		int consonant=ch.length-countvow;
		
		System.out.println("Number of Vowel" + " "+ countvow);
		System.out.println("Number of Consonant" + " "+ consonant);
		
	}

}
