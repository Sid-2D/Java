import java.net.*;
import java.io.*;

public class Server {
	public static void main (String args[]) throws SocketException, IOException {
		DatagramSocket ds = new DatagramSocket();
		String s = "Sid: Call when you have time.";
		byte b[] = s.getBytes();
		InetAddress i = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(b, b.length, i, 1026);
		ds.send(dp);
		ds.close();
	}
}