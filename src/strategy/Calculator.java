package strategy;

public class Calculator {

	public static void main(String[] args) {

		Sum sum = new Sum();
		Multiply multiply = new Multiply();
		
		operate(sum, 2, 5);
		operate(multiply, 2, 5);

	}
	
	private static void operate(Operation operation, float num1, float num2) {
		String result = operation.getName() + " of " + num1 + " " + operation.getSymbol() + " " + num2;
		
		result += " is " + operation.doOperation(num1, num2);
		
		System.out.println(result);
	}

}
