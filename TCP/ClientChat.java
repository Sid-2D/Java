import java.io.*;
import java.net.*;
import java.util.*;

public class ClientChat {
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	Scanner in;
	public ClientChat () {
		try {
			in = new Scanner(System.in);
			s = new Socket("localhost", 1026);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			startChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void startChat () throws IOException {
		String str = "";
		boolean turn = false;
		while (!str.equals("bye")) {
			if (turn) {
				str = in.nextLine();
				dout.writeUTF(str);
				dout.flush();
				turn = false;
			} else {
				str = din.readUTF();
				System.out.println(str);
				turn = true;
			}
		}
	}
	public static void main (String args[]) {
		String s1 = "hello";
		String s2 = "hello";
		new ClientChat();
	}
}