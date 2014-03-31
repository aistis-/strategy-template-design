package strategy;

public interface Operation {
	
	public String getName();
	public char getSymbol();
	public float doOperation(float num1, float num2);
	
}
