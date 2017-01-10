import java.rmi.*;

class RMIClient {
	public static void main (String[] args) {
		try {
			AddServerInterface stub = (AddServerInterface)Naming.lookup("rmi://localhost:5000/sid");
			System.out.println(stub.sum(6, 9));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}