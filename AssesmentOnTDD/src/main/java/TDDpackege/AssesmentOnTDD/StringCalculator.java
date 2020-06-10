package TDDpackege.AssesmentOnTDD;

public class StringCalculator {
	public static int add(String numbers)
	{
		if(numbers.length() == 0 )
		return 0;
		else if(numbers.length() == 1)
		{
			return Integer.parseInt(numbers);
		}
		else if(numbers.length() >= 2 )
		{
		//	String temp = ""; 
			int sum = 0; 
			for(int i = 0; i < numbers.length(); i++) 
			{ 
				char ch = numbers.charAt(i); 
				
				// if current character is a digit 
				if (Character.isDigit(ch)) 
					sum += Integer.parseInt(String.valueOf(ch)); 
		
				
			} 
			/*numbers.replaceAll("\n", ",") ; 
			System.out.println("numbers  " + numbers );
			int sumOfNumber = 0  ; 
			
			 String[] nums = numbers.split(",");
			 for (String num : nums) {
				 System.out.println(num);
	                if (!num.isEmpty()) {
	                	sumOfNumber += Integer.parseInt(num);
	                }
	            }*/
			 return sum ; 
		}
		else
			return -1 ; 
	}

}
