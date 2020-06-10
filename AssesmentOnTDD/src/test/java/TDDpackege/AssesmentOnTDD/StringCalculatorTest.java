package TDDpackege.AssesmentOnTDD;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	@Test
    public  void addEmptyNumbers() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(0, str.add(""));
        
    }
	@Test
    public  void AddStringContainOnlyOneElement() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1, str.add("1"));
        
    }
	@Test
    public  void AddStringContainTwoElement() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2, str.add("1,2"));
        
    }
	@Test
    public  void AddStringContainUnknownAmountOfNumbers() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2+6+7+8, str.add("1,2,6,7,8"));
        
    }
	@Test
    public  void AddStringContainNewLine() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2+3, str.add("1\n2,3,4"));
        
    }

}
