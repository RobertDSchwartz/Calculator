package calculator.processor;

import java.lang.Math;
/**
 * increases the nubmer of functions available
 * extends StandardCalc
 * implements AdvancedMath
 * 
 * @author Robert Schwartz
 * @since date 04/06/2022
 * @version 1.0 beta
 *
 */
public class AdvancedCalc extends StandardCalc implements AdvancedMath {

	/**
	 * default constructor
	 */
	public AdvancedCalc() {
	}
	
	/**
	 * shows the previous value being put to the power of the user input and shows end result
	 */
	@Override
	public void pow(double input) {
		System.out.print(this.currValue + "^ " + input + " = ");
		this.currValue = Math.pow(this.currValue, input);
		System.out.println(this.currValue);
	}

	/**
	 * shows the previous value being square rooted
	 */
	@Override
	public void sqrt() {
		System.out.print("sqrt(" + this.currValue + ") = ");
		this.currValue = Math.sqrt(currValue);
		System.out.println(this.currValue);
	}

}
