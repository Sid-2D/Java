import java.io.*;
import java.net.*;

public class MyClient {
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	public MyClient () {
		try {
			s = new Socket("localhost", 1026);
			System.out.println(s);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			clientChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main (String[] args) {
		new MyClient();
	}
	public void clientChat () throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			System.out.println("Server Message" + din.readUTF());
		} while (!str.equals("stop"));
	}
}