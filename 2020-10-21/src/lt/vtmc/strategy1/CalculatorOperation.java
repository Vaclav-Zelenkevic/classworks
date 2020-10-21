package lt.vtmc.strategy1;

public class CalculatorOperation {
	private CalculatorStrategy calculatorStrategy;
	
	public CalculatorOperation() {}
	
	public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy) {
		this.calculatorStrategy = calculatorStrategy;
	}
	
	public CalculatorStrategy getCalculatorStrategy() {
		return calculatorStrategy;
	}
	
	public int executeCalculation(int a, int b) {
		return calculatorStrategy.executeCalculation(a, b);
	}
}
