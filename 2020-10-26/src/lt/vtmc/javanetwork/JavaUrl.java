package lt.vtmc.javanetwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class JavaUrl {

	private static URL url;
	
	public static void main(String[] args) {
		try {
			url = new URL("https://www.delfi.lt");
//			url = new URL("http://africau.edu/images/default/sample.pdf");
			getUrlConnectionInfo(url);
			getUrlIPAddress(url);
			getUrlInfo(url);
			downloadFileByUrl(url);
		} catch (Exception e) {
		}

	}

	private static void downloadFileByUrl(URL url) throws IOException {
		URLConnection urlConnection = url.openConnection();
		InputStream inputStream = urlConnection.getInputStream();
		FileOutputStream fos = new FileOutputStream("index.html");
		int stream = 0;
		while ((stream = inputStream.read()) != -1) {
			fos.write(stream);
			fos.flush();
		}
	}

	private static void getUrlInfo(URL url) {
		System.out.println("Protocol: " + url.getProtocol());
		System.out.println("Host: " + url.getHost());
		System.out.println("Port: " + url.getPort());
		System.out.println("Get file path: " + url.getFile());
	}

	private static void getUrlIPAddress(URL url) throws UnknownHostException {
		InetAddress ia = InetAddress.getByName(url.getHost());
		String ipAddress = ia.getHostAddress();
		System.out.printf("IP address of %s is %s %n", url, ipAddress);
	}

	private static void getUrlConnectionInfo(URL url) throws IOException {
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		for (int i = 1; i <= 8; i++) {
			System.out.println(httpURLConnection.getHeaderFieldKey(i) + " " 
		+ httpURLConnection.getHeaderField(i));
		}
	}

}
