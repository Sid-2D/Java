import java.io.*;
import java.net.*;

public class MyServer {
	ServerSocket ss;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	public MyServer () {
		try {
			System.out.println("Server Started");
			ss = new ServerSocket(1026);
			s = ss.accept();
			System.out.println(s);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			serverChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main (String[] args) {
		new MyServer();
	}
	public void serverChat() throws IOException {
		String str;
		do {
			str = din.readUTF();
			dout.writeUTF("hello " + str);
			dout.flush();
		} while(!str.equals("stop"));
	}
}