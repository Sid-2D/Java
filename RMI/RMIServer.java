import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class RMIServer {
	public static void main (String[] args) {
		try {
			AddServerInterface addSource = new RMIHost();
			Naming.rebind("rmi://localhost:5000/sid", addSource);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}