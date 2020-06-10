package TDDpackege.AssesmentOnTDD;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	@Test
    public  void addEmptyNumbers() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(0, str.add(""));
        
    }

}
