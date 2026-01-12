package code_coverage_4.code_coverage_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class function2Test {
	 @Test
	    public void T1_pNotZero_shouldReturnExpectedString() {
	        String result = func2.func2(5.5f, 18.2f);
	        assertEquals("p=15.50, q=1.17", result);
	    }

	    @Test
	    public void T2_pZero_shouldReturnInfinity() {
	    	 String result = func2.func2(0.0f, 20.0f);
	         String qPart = result.substring(result.indexOf("q=") + 2).trim();
	         float q = Float.parseFloat(qPart);
	         // התקלה: q לא סופי (Infinity/NaN) כאשר p==0
	         assertFalse("Expected non-finite q (Infinity/NaN), got: " + result, Float.isFinite(q));
	    }
}

