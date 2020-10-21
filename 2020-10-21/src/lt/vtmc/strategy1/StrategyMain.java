package lt.vtmc.strategy1;

public class StrategyMain {

	public static void main(String[] args) {
		CalculatorOperation calculatorOperation = new CalculatorOperation();
		calculatorOperation.setCalculatorStrategy(new MultiplyStrategy());
		System.out.println(calculatorOperation.executeCalculation(10, 20));
	}

}
