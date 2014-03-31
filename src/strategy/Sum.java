package strategy;

public class Sum implements Operation {
	
	public String getName() {
		return "Compostion";
	}
	
	public char getSymbol() {
		return '+';
	}
	
	public float doOperation(float num1, float num2) {
		return num1 + num2;
	}
	
}
