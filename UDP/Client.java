import java.io.*;
import java.net.*;

public class Client {
	public static void main (String args[]) throws SocketException, IOException {
		DatagramSocket ds = new DatagramSocket(1026);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		ds.close();
		String r = new String(dp.getData());
		System.out.println(r.trim());
	}
}