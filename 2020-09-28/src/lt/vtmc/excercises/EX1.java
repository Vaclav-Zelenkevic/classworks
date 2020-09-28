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
		System.out.println(stringNumber);
		
		String loveMessage = "I love you ..."; // char -> int -> binary
		char[] letters = loveMessage.toCharArray();
		int[] codedLetters = new int[letters.length];
		for(int i = 0; i < letters.length; i++) {
			codedLetters[i] = Integer.toBinaryString(letters[i]);
		}
		System.out.println(Arrays.toString(letters));
	}

}
