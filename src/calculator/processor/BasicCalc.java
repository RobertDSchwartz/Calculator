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
		System.out.print(this.currValue + " + " + input + " = ");
		this.currValue += input;
		System.out.println(this.currValue);
	}

	@Override
	public void subtract(double input) {
		System.out.print(this.currValue + " - " + input + " = ");
		this.currValue -= input;
		System.out.println(this.currValue);
	}
	
	@Override
	public void multiply(double input) {
		System.out.print(this.currValue + " * " + input + " = ");
		this.currValue *= input;
		System.out.println(this.currValue);
	}
	
	@Override
	public void divide(double input) {
		System.out.print(this.currValue + " / " + input + " = ");
		this.currValue /= input;
		System.out.println(this.currValue);
	}
}
