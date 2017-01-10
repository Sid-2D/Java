interface myInterface {
	void show();
}

public class InterfaceClass implements myInterface {
	int x, y;
	public void show() {
		System.out.println("Calculating...");
	}
	public void show(int x) {
		System.out.println("Product = " + x);
	}
	void show(int x, int y) {
		System.out.println("Product = " + x * y);
	}
	public static void main (String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.show();
		obj.show(3);
		obj.show(3, 3);
	}
}