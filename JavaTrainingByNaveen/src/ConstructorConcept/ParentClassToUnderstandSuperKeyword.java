package ConstructorConcept;

public class ParentClassToUnderstandSuperKeyword {

	// Declare three types of Constructors of this Class

	public ParentClassToUnderstandSuperKeyword() {

		System.out.println("Default---No Parameter Parent Class Constructor");
	}

	public ParentClassToUnderstandSuperKeyword(int i) {

		System.out.println("Single Parameter Parent Class Constructor");
		System.out.println("Value of i is: " + i);
	}

	public ParentClassToUnderstandSuperKeyword(int i, int j) {

		System.out.println("Double Parameter Parent Class Constructor");
		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
	}

}
