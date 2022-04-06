package calculator.processor;

/**
 * code to calculate simple problems and display the outcome of it
 * includes multiple functions for basic processes
 * implements BasicMath
 * 
 * @author Robert Schwartz
 * @since date 04/06/2022
 * @version 1.0 beta
 * 
 */
public abstract class BasicCalc implements BasicMath {
	/**
	 * holds the current value that would be on the screen
	 * 
	 * basic calc functions happen to/with this number
	 */
	protected double currValue;
	
	/**
	 * Default constructor making currValue 0
	 */
	public BasicCalc() {
		this.currValue = 0.0;
	}
	
	/**
	 * clears the current value and displays that it worked
	 */
	public void clear() {
		this.currValue = 0.0;
		System.out.println("value is now " + this.currValue);
	}
	
	/**
	 * shows the previous value being added to the user input and shows the end result
	 */
	@Override
	public void add(double input) {
		System.out.print(this.currValue + " + " + input + " = ");
		this.currValue += input;
		System.out.println(this.currValue);
	}

	/**
	 * shows the previous value being reduced by the user input and shows the end result
	 */
	@Override
	public void subtract(double input) {
		System.out.print(this.currValue + " - " + input + " = ");
		this.currValue -= input;
		System.out.println(this.currValue);
	}
	
	/**
	 * shows the previous value being multiplied by the user input and shows the end result
	 */
	@Override
	public void multiply(double input) {
		System.out.print(this.currValue + " * " + input + " = ");
		this.currValue *= input;
		System.out.println(this.currValue);
	}
	
	/**
	 * shows the previous value being divided by the user input and shows the end result
	 */
	@Override
	public void divide(double input) {
		System.out.print(this.currValue + " / " + input + " = ");
		this.currValue /= input;
		System.out.println(this.currValue);
	}
}
