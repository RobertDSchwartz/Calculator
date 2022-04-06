package calculator.processor;

/**
 * introduces advanced mathimatical calculations such as power and square root
 * 
 * @author Robert Schwartz
 * @since date 04/06/2022
 * @version 1.0 beta
 *
 */
public interface AdvancedMath {
	/**
	 * calculates the power with the numbers using the java.lang.math library
	 * @param input the number of times the value will be multiplied by itself
	 */
	void pow(double input);
	/**
	 * finds the square root of a number using the java.lang.Math library
	 */
	void sqrt();
}
