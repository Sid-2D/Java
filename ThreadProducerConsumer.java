import java.io.*;

class Q {
	int n;
	boolean turn = false;
	synchronized void get () {
		System.out.println("Got: " + n);
		if (!turn) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		turn = false;
		notify();
	}
	synchronized void put (int n) {
		this.n = n;
		System.out.println("Put: " + n);
		if (turn) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		turn = true;
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	Producer (Q q)  {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run () {
		int i = 0;
		while (true) {
			q.put(i++);
			if (i >= 7) {
				System.exit(0);
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;
	Consumer (Q q)  {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run () {
		while (true) {
			q.get();
		}
	}
}

public class ThreadProducerConsumer {
	public static void main (String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}