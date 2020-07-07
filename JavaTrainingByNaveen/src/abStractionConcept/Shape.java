package abStractionConcept;

public abstract class Shape {

	// abstract calss can have abstract methods and non-abstract methods(methods
	// with method body) too.
	// That's how it achieves zero to hundred percent abstraction.

	String shape = "Oval";

	abstract void drawing();// abstract method or method without any method body

	public void fill() {// non abstract method
		System.out.println("Parent Class Fill method");
	}

}
