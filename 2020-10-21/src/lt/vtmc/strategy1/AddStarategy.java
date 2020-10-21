package lt.vtmc.strategy1;

public class AddStarategy implements CalculatorStrategy{

	@Override
	public int executeCalculation(int a, int b) {
		return  a + b;
	}

}
