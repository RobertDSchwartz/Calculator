package calculator.app;

import calculator.processor.*;
public class MainApp {

	MainApp(){
	}
	
	private static String SINGLE = "---------------------";
	private static String DOUBLE = "=====================";
	private static String DOUBLELONG = "============================================";
	
	private static void unitTest1_StandardCalc_Default() {
		System.out.println("Start of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
		StandardCalc calc1 = new StandardCalc();
		System.out.println(DOUBLE);
		
		calc1.add(3);
		System.out.println(SINGLE);
		
		calc1.subtract(2);
		System.out.println(SINGLE);
		
		calc1.multiply(6);
		System.out.println(SINGLE);
		
		calc1.divide(3);
		System.out.println(SINGLE);
		
		calc1.memoryAdd();
		System.out.println(SINGLE);
		
		System.out.println("adding memory back to current value");
		calc1.add(calc1.memoryRecall());
		System.out.println(SINGLE);
		
		calc1.memorySubtract();
		System.out.println(SINGLE);
		
		System.out.println("End of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	private static void unitTest2_AdvancedCalc_Default() {
		System.out.println("Start of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
		AdvancedCalc calc2 = new AdvancedCalc();
		System.out.println(DOUBLE);
		
		calc2.add(9);
		System.out.println(SINGLE);
		
		calc2.sqrt();
		System.out.println(SINGLE);
		
		calc2.pow(4);
		System.out.println(SINGLE);
		
		System.out.println("End of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public static void main(String[] args) {
		
		unitTest1_StandardCalc_Default();
		System.out.println(DOUBLELONG);
		unitTest2_AdvancedCalc_Default();
	}
}
