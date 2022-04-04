package calculator.processor;

public abstract class BasicCalc implements BasicMath {
	protected double currValue;
	
	public BasicCalc() {
		this.currValue = 0.0;
	}
	
	public void clear() {
		this.currValue = 0.0;
	}
	
	@Override
	public void add(double input) {
		this.currValue += input;
	}

	@Override
	public void subtract(double input) {
		this.currValue -= input;
	}
	
	@Override
	public void multiply(double input) {
		this.currValue *= input;
	}
	
	@Override
	public void divide(double input) {
		this.currValue /= input;
	}
}
