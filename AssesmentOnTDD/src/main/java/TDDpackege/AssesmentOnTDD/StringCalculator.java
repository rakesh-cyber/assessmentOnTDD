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
			int sum = 0; 
			for(int i = 0; i < numbers.length(); i++) 
			{ 
				char ch = numbers.charAt(i); 
				if (Character.isDigit(ch)) 
					sum += Integer.parseInt(String.valueOf(ch)); 

			} 
		
			 return sum ; 
		}
		else
			return -1 ; 
	}

}
