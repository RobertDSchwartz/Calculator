package calculator.app;

public class MainApp {

	MainApp(){
	}
	
	private static void unitTest1_() {
		System.out.println("Start of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		System.out.println("End of Test " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public void main(String[] args) {
		unitTest1_();
	}
}
