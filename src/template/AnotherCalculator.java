package template;

public class AnotherCalculator {

	private Operation operation;

	public void operate(float num1, float num2) {
		String result = num1 + " " + this.operation.getSymbol() + " " + num2;
		
		result += " is " + this.operation.doOperation(num1, num2);
		
		System.out.println(result);
	}
	
	public AnotherCalculator setOperation(Operation operation) {
		this.operation = operation;
		
		return this;
	}
}