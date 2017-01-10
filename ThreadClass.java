import java.io.*;

class A extends Thread {
	public void run () {
		System.out.println("Thread A");
		for (int i = 0; i < 6; i++) {
			System.out.println("From thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B implements Runnable {
	public void run () {
		System.out.println("Thread B");
		for (int i = 0; i < 6; i++) {
			System.out.println("From thread B: i = " + i);
		}
		System.out.println("Exit from B");
	}
}

class Thread1 extends Thread {
	Print P;
	Thread1(String s, Print p) {
		super(s);
		P = p;
		start();
	}
	public void run () {
		synchronized (P) {
			P.print();
		}	
	}
}

class Print {
	void print () {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	}
}

public class ThreadClass {
	public static void main (String[] args) {
		// new A().start();
		// B b = new B();
		// Thread iThread = new Thread(b);
		// iThread.start();
		// System.out.println("End of main thread.");
		Print t = new Print();
		new Thread1("Thread 1", t);
		new Thread1("Thread 2", t);
		// new Thread1("Thread 3", t);
	}
}