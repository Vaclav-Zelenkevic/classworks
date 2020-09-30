package lt.vtmc.excercises;

import java.util.Arrays;

public class EX1 {

	public static void main(String[] args) {
		char[] word = {'w', 'o', 'r', 'l', 'd'}; // Immutable!
//		String name = String.valueOf(word);
//		name.toUpperCase();
		char ch1 = Character.toUpperCase('a');
		System.out.println(ch1);
		char[] bigWord = new char[word.length];
		for(int i = 0; i < word.length; i++) {
			bigWord[i] = Character.toUpperCase(word[i]);
		}
		System.out.println(Arrays.toString(bigWord));
//		System.out.println(name);
		int number = 20;
		String stringNumber = Integer.toString(number);
		System.out.println(stringNumber.hashCode());
		
		String loveMessage = "I love you ..."; // char -> int -> binary
		StringBuilder sb = new StringBuilder();
		char[] chars = loveMessage.toCharArray();
		for(char letter: chars) {
			sb.append(String.format("%8s", Integer.toBinaryString(letter)).replaceAll(" ", "*"));
		}
		System.out.println(sb.toString());
	
	}

}
