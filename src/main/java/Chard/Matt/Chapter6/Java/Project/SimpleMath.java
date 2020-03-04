package Chard.Matt.Chapter6.Java.Project;

public class SimpleMath {

	public double divide( double numerator, double denominator) {
		if(denominator==0) {
			throw new ArithmeticException("Cannot Divide By Zero");
		}
		double Result= numerator/denominator;
		return Result;
	}
	
}
