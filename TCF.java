import java.util.*;

class TCF {
	public static void main (String[] args) {
		try {
			System.out.println("At try:");
			int d = 25 / 5;
			System.out.println(d);
		} catch (Exception e) {
			System.out.println("At catch: " + e);
		} finally {
			System.out.println("At finally.");
		}
	}
}