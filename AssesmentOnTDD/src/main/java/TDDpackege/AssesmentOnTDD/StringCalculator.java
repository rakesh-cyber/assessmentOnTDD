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
		else
			return -1 ; 
	}

}
