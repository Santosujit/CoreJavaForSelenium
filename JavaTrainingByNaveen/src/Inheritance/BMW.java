package Inheritance;

public class BMW extends Car {// has a relationship. BMW is the child class of Car class. Through BMW object
								// you can access or call car class methods
	public void start() {
		System.out.println("BMW (Child)---Start method");
	}

	public void theftsafety() {
		System.out.println("BMW (Child)---TheftSafety method");// query-why exception is coming
	}
}
