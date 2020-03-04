package Chard.Matt.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath yuppersSimpleMath= new SimpleMath();
			assertEquals(0, yuppersSimpleMath.divide(0,7),.001); 
	}
	@Test
	public void TestThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath noppersSimpleMath= new SimpleMath();
			assertEquals(.25, noppersSimpleMath.divide(1,4), .001);
	}
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath maybersSimpleMath= new SimpleMath();
			maybersSimpleMath.divide(6,0);
	}		
}