package code_coverage_4.code_coverage_4;
import org.junit.Test;
public class function3Test {
	@Test(expected = ArithmeticException.class)
	public void T1_anyInput_shouldThrow_ArithmeticException() {
		func3.func3(10);
	}

}
