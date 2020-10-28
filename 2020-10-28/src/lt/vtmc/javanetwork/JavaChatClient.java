package lt.vtmc.javanetwork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaChatClient {

	public static void main(String[] args) {
		try (Socket socket = new Socket("192.168.1.79", 3333);
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String clienMessage = "";
			String serverMessage = "";
			while (!clienMessage.equalsIgnoreCase("bye")) {
				System.out.println("Write client message: ");
				serverMessage = br.readLine();
				dos.writeUTF(serverMessage);
				dos.flush();
				clienMessage = dis.readUTF();
				System.out.println("Server says: " + clienMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
