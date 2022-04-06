package calculator.processor;

/**
 * sets the basic mathimatical calculations that can happen
 * 
 * @author Robert Schwartz
 * @since 04/06/2022
 * @version 1.0 Beta
 */
public interface BasicMath {
	/**
	 * @param input from user to add to value
	 */
	void add(double input);
	/**
	 * @param input from user to subtract from value
	 */
	void subtract(double input);
	/**
	 * @param input from user to multiply to value
	 */
	void multiply(double input);
	/**
	 * @param input from user to divide from value
	 */
	void divide(double input);
}
