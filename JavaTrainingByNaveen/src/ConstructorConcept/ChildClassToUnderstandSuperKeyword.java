package ConstructorConcept;

//the child class is inheriting parent class meaning child class access all the methods and variables of the parent class.

public class ChildClassToUnderstandSuperKeyword extends ParentClassToUnderstandSuperKeyword {

	public ChildClassToUnderstandSuperKeyword() {
		super();

		// super keyword is used inside child class to call parent class constructor.
		// super keyword should be the first sentence inside any child class constructor
		// so you can't have more than one super keyword inside a child class
		// constructor

		System.out.println("Child Class Default---No Parameter Constructor");

	}

	public ChildClassToUnderstandSuperKeyword(int i) {

		super(i); // it will call the parent class's's single parameter constructor
		System.out.println("Single Parameter Child Class Constructor");

	}

	public ChildClassToUnderstandSuperKeyword(int i, int j) {

		super(i, j);// it will call the parent class's double parameter constructor
		System.out.println("Double Parameter Child Class Constructor");

	}

	public static void main(String[] args) {

		// while initializing the object, based on the parameters, the resepctive
		// constructor will be called from the parent class

		ChildClassToUnderstandSuperKeyword ch1 = new ChildClassToUnderstandSuperKeyword();
		ChildClassToUnderstandSuperKeyword ch2 = new ChildClassToUnderstandSuperKeyword(10);
		ChildClassToUnderstandSuperKeyword ch3 = new ChildClassToUnderstandSuperKeyword(20, 40);

	}

}
