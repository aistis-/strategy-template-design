package template;

public abstract class Operation {
	
	public String getName() {
		return "Operation";
	}
	
	public char getSymbol() {
		return ' ';
	}
	
	public float doOperation(float num1, float num2) {
		return num1 + num2;
	}
	
}
