import java.io.*;

class FileIO {
	public static void main (String args[]) throws IOException {
		FileOutputStream fw = new FileOutputStream("output.js");
		String s = "abc";
		byte b[] = s.getBytes();
		fw.write(b);
		fw.close();
		FileInputStream fr = new FileInputStream("output.js");
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}