import java.io.*;

class myException extends Exception {
	myException(String name) {
		super(name);
	}
	void checkedExceptionOpenFile() throws IOException {		// IOException is checked.
		System.out.println("We must put the invokation of this in try/catch block.");
		FileInputStream fr = new FileInputStream("output.js");
		String contents = "";
		int c;
		while ((c = fr.read()) != -1) {
			contents += (char)c;
		}
		System.out.println("The contents of the file are: " + contents);
		fr.close();
	}
	void uncheckedExceptionDivide (int x, int y) throws ArithmeticException {		// ArithmeticException is unchecked.
		System.out.println("The invokation of this function does not need a try/catch block");
		System.out.println("The answer is: " + x / y);
	}
}

public class ExceptionHandling {
	public static void main (String args[]) {
		myException myObj = new myException("CustomException");
		try {
			myObj.checkedExceptionOpenFile();
		} catch (Exception e) {
			System.out.println(e);
		}
		myObj.uncheckedExceptionDivide(9, 3);
	}
}