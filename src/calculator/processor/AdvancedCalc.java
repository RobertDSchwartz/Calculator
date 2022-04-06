package calculator.processor;

import java.lang.Math;
public class AdvancedCalc extends StandardCalc implements AdvancedMath {

	public AdvancedCalc() {
		
	}
	
	@Override
	public void pow(double input) {
		System.out.print(this.currValue + "^ " + input + " = ");
		this.currValue = Math.pow(this.currValue, input);
		System.out.println(this.currValue);
	}

	@Override
	public void sqrt() {
		System.out.print("\u221A" + this.currValue + " = ");
		this.currValue = Math.sqrt(currValue);
		System.out.println(this.currValue);
	}

}
