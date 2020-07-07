package ConstructorConcept;

public class ConstructorWithThisKeyword {

	// Global Variables or Class Variable

	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		this.name = name;// The statements --- this global variable is equal to the local variable
		this.age = age;// this global variable is equal to the local variable
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Santosh", 23);

	}

}
