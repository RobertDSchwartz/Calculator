package calculator.processor;

public class StandardCalc extends BasicCalc {
	protected double memoryValue;
	
	public StandardCalc() {
		this.memoryValue = 0.0;
	}
	
	public void memoryClear() {
		this.memoryValue = 0.0;
	}
	
	public void memoryAdd() {
		System.out.print(memoryRecall() + " M+ " + this.currValue + " = ");
		this.memoryValue += this.currValue;
		System.out.println(memoryRecall());
	}

	public void memorySubtract() {
		System.out.println("subtracting memory from current value");
		this.memoryValue -= this.currValue;
		System.out.println(memoryRecall());
	}
	
	public double memoryRecall() {
		return this.memoryValue;
		
	}
}
