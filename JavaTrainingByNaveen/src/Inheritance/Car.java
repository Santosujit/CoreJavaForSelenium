package Inheritance;

public class Car extends Automobile {// car class is the child class of automobile class. Automobile is the
										// grandparent of BMW. This is called multi level inheritance.
	public void start() {
		System.out.println("Car (Parent)---Start method");
	}

	public void stop() {
		System.out.println("Car (Parent)---Stop method");
	}

	public void refuel() {
		System.out.println("Car (Parent)---Refuel method");
	}
}
