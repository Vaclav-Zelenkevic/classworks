package lt.vtmc.javanetwork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaChatServer {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(80);
				Socket socket = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String clienMessage = "";
			String serverMessage = "";
			while (!clienMessage.equalsIgnoreCase("bye")) {
				clienMessage = dis.readUTF();
				System.out.println("Client says: " + clienMessage);
				System.out.println("Write server message: ");
				serverMessage = br.readLine();
				dos.writeUTF(serverMessage);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
