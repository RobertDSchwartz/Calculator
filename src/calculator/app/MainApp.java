package calculator.app;

import calculator.processor.*;
/**
 * tests both the advanced calculator and the standard calculator
 * 
 * @author Robert Schwartz
 * @since date 04/06/2022
 * @version 1.0 beta
 *
 */
public class MainApp {

	/**
	 * default constructor for Main
	 */
	public MainApp(){
	}
	
	/**
	 * used to display a single dashed line
	 */
	private static String SINGLE = "-------------------------------";
	/**
	 * used to display a double dashed line
	 */
	private static String DOUBLE = "=======================================";
	
	/**
	 * test to see how well the standard caluclator works with all it's functions
	 */
	private static void test1_Standard_Calculator() {
		System.out.println("Start of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
		StandardCalc calc1 = new StandardCalc();
		System.out.println(DOUBLE);
		
		System.out.println("Testing Addition");
		calc1.add(3);
		System.out.println(SINGLE);
		
		System.out.println("Testing Subtraction");
		calc1.subtract(2);
		System.out.println(SINGLE);
		
		System.out.println("Testing Multiplication");
		calc1.multiply(6);
		System.out.println(SINGLE);
		
		System.out.println("Testing Memory Addition");
		calc1.memoryAdd();
		System.out.println(SINGLE);
		
		System.out.println("Testing Division");
		calc1.divide(3);
		System.out.println(SINGLE);
		
		System.out.println("Testing Subtraction from Memory");
		calc1.subtract(calc1.memoryRecall());
		System.out.println(SINGLE);
		
		System.out.println("Testing Memory Subtraction");
		calc1.memorySubtract();
		System.out.println(SINGLE);
		
		System.out.println("Testing Clear");
		calc1.clear();
		System.out.println(SINGLE);
		
		System.out.println("Testing Memory Clear");
		calc1.memoryClear();
		System.out.println(SINGLE);
		
		System.out.println("End of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/**
	 * test to see how well the advanced calculator works with it's new functions 
	 * also uses a couple of old ones to get it started and ended
	 */
	private static void test2_Advanced_Calculator() {
		System.out.println("Start of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
		AdvancedCalc calc2 = new AdvancedCalc();
		System.out.println(DOUBLE);
		
		System.out.println("Testing Addition");
		calc2.add(9);
		System.out.println(SINGLE);
		
		System.out.println("Testing Square Root");
		calc2.sqrt();
		System.out.println(SINGLE);
		
		System.out.println("Testing Power");
		calc2.pow(4);
		System.out.println(SINGLE);
		
		System.out.println("Testing Clear");
		calc2.clear();
		System.out.println(SINGLE);
		
		System.out.println("Testing Memory Clear");
		calc2.memoryClear();
		System.out.println(SINGLE);
		
		System.out.println("End of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/**
	 * main method that runs the tests to ensure prorper function
	 * 
	 * @param args No command line input args are used for this application
	 */
	public static void main(String[] args) {
		
		test1_Standard_Calculator();
		System.out.println(DOUBLE);
		System.out.println();
		test2_Advanced_Calculator();
		System.out.println(DOUBLE);
	}
}
