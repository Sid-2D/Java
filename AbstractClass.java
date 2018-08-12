abstract class Base {
	abstract void show();
}

class Derived extends Base {
	void show() {
		System.out.println("Hello");
	}
}

public class AbstractClass {
	public static void main(String args[]) {
		Derived d = new Derived();
		// Base b = new Base() --> Error cannot be instantiated
		d.show();
	}	
}