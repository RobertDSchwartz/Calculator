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
		this.memoryValue += this.currValue;
	}

	public void memorySubtract() {
		this.memoryValue -= this.currValue;
	}
	
	public void memoryRecall() {
		
	}
}
