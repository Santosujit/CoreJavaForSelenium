package ConstructorConcept;

public class ConstructorConcept {

	public ConstructorConcept() {

		System.out.println("Default or NO Parameter Constructor");
	}

	public ConstructorConcept(int i) {

		System.out.println("Single Parameter Constructor");
		System.out.println("Value of i " + i);
	}

	public ConstructorConcept(int i, int j) {

		System.out.println("Double Parameter Constructor");
		System.out.println("Value of i " + i);
		System.out.println("Value of j " + j);
	}

	public static void main(String[] args) {

		// constructor are like functions but not exactly functions
		// constructor don't have any return type
		// constructor can be overloaded
		// non static methods are called using object reference
		// static methods can be called directly inside the main function
		// constructor is called immediately when you create the object of the
		// constructor
		// Default constructor is a hidden constructor

		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept(10);
		ConstructorConcept obj3 = new ConstructorConcept(20, 30);

	}

}
