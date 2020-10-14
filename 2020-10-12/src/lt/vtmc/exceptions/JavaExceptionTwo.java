package lt.vtmc.exceptions;

import java.io.IOException;

public class JavaExceptionTwo {

	public static void main(String[] args) {
		sendMessageIfEven(2, "My message");
		System.out.println("Nothing ...");
	}
	
	public static void sendMessageIfEven(int number, String message){
		if(number % 2 ==0) {
			sendMessage(message);
		}
	}

	private static void sendMessage(String message) throws IllegalStateException{
//		if (message == null) {
//			throw new IllegalStateException("Message can't be null ...");
//		} else {
//			System.out.println(message);
//		}
		try {
			sendBinaryMessageToNetwork(message);
		} catch (IOException e) {
			throw new IllegalStateException("Problems with network ...");
		}
	}
	
	public static void sendBinaryMessageToNetwork(String message) throws IOException {
		throw new IOException("No network resource ...");
	}

}
