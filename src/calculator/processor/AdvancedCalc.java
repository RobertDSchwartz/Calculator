package calculator.processor;

import java.lang.Math;
public class AdvancedCalc extends StandardCalc implements AdvancedMath {

	public AdvancedCalc() {
		
	}
	
	@Override
	public void pow(double input) {
		Math.abs(input);
	}

	@Override
	public void sqrt() {
		Math.abs(this.currValue);		
	}

}
