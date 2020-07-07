package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		// you can not create duplicate method. same method name with same no of
		// arguments are not allowed.
		// you can not create method inside a method.
		// method overloading is the same method name, but different no of input
		// arguments
		// or parameters, or same no of parameters but with different data types, inside
		// the same class.

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.4);
		obj.sum(10, 20);

	}

	// main method can also be overloaded.---query

	public static void main(int a) {

	}

	public static void main(int a, int b) {

	}

	// sum() method is overloaded

	public void sum() {
		System.out.println("No input parameter");
	}

	public void sum(int a) {
		System.out.println("1 input parameter");
		System.out.println(a);
	}

	public void sum(double b) {
		System.out.println("1 inpiut parameter but different data type as double");
		System.out.println(b);
	}

	public void sum(int a, int b) {
		System.out.println("2 inpiut parameter");
		System.out.println(a + b);
	}

}