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
			int sumOfNumber = 0  ; 
			 String[] nums = numbers.split(",");
			 for (String num : nums) {
	                if (!num.isEmpty()) {
	                	sumOfNumber += Integer.parseInt(num);
	                }
	            }
			 return sumOfNumber ; 
		}
		else
			return -1 ; 
	}

}
