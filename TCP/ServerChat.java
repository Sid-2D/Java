import java.io.*;
import java.net.*;
import java.util.*;

public class ServerChat {
	ServerSocket ss;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	Scanner in;
	ServerChat() {
		System.out.println("Server Started!");
		try {
			in = new Scanner(System.in);
			ss = new ServerSocket(1026);			
			s = ss.accept();
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			startChat();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void startChat() throws IOException {
		String str = "";
		boolean turn = true;
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
		new ServerChat();
	}
}