package strategy;

import strategy.Multiply;
import strategy.Operation;
import strategy.Sum;

public class Program {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		AnotherCalculator anotherCalculator = new AnotherCalculator();
		
		Operation sum = new Sum();
		Operation multiply = new Multiply();
		
		calculator.setOperation(sum).operate(2, 5);
		calculator.setOperation(multiply).operate(2, 5);
		
		anotherCalculator.setOperation(sum).operate(2, 5);
		anotherCalculator.setOperation(multiply).operate(2, 5);
	}

}
