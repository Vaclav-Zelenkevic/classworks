package lt.vtmc.vaclav;

public class GeneratorOne {
	public int[] luckyNumbers;
	
	public int[] generateNumbers(int arraySize) {
		this.luckyNumbers = new int[arraySize];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = (int)(Math.random()*100);
		}
		return luckyNumbers;
	}
}
