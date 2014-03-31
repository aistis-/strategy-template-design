package strategy;

public class Multiply implements Operation {
	
	public String getName() {
		return "Multiplication";
	}
	
	public char getSymbol() {
		return '*';
	}
	
	public float doOperation(float num1, float num2) {
		return num1 * num2;
	}
	
}
