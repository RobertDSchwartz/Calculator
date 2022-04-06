package calculator.processor;

/**
 * adds a memory value to the basic calculator 
 * adds multiple memory functions
 * extends BasicCalc
 * 
 * @author Robert Schwartz
 * @since date 04/06/2022
 * @version 1.0 beta
 *
 */
public class StandardCalc extends BasicCalc {
	/**
	 * value stored into a seperate place form current value 
	 * so you can have multiple numbers being stored
	 */
	protected double memoryValue;
	
	/**
	 * Default constructor making memoryValue 0 
	 */
	public StandardCalc() {
		this.memoryValue = 0.0;
	}
	
	/**
	 * clears the memory value and displays that it worked
	 */
	public void memoryClear() {
		this.memoryValue = 0.0;
		System.out.println("memory is now " + this.memoryValue);
	}
	
	/**
	 * adds currValue to existing memoryValue
	 * shows it is different from regular add by showing a M+ instead of just +
	 */
	public void memoryAdd() {
		System.out.print(this.memoryValue + " M+ " + this.currValue + " = ");
		this.memoryValue += this.currValue;
		System.out.println(this.memoryValue);
	}

	/**
	 * subtracts currValue from memoryValue 
	 * shows it is different from regular subtract by showing a M- instead of just -
	 */
	public void memorySubtract() {
		System.out.print(this.memoryValue + " M- " + this.currValue + " = ");
		this.memoryValue -= this.currValue;
		System.out.println(this.memoryValue);
	}
	
	/**
	 * @return the current value being stored in memory to be used in MainApp
	 */
	public double memoryRecall() {
		return this.memoryValue;
		
	}
}
