package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// static or compile time polymorphism (one to many methods, BMW Child class
		// objects is accessing many methods from his parents
		BMW b = new BMW();
		b.start();// start method is present in both parent, and child. child method will be
					// called. Overridden method
		b.theftsafety();// child calling own method
		b.stop();// child calling parent's method
		b.refuel();// child calling parent's method
		b.engine();// child calling grand parent's method, multi level inheritance

		System.out.println("***********");

		Car c = new Car();// c is pointing to new Car() object
		c.start();// start method is present in both parent, and child. parent method will be
					// called, as we are calling thru
		// parent class reference variable
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("***********");

		// c.theftsafety();//Parent class reference can't access child class method, if
		// it is not common between two

		/*
		 * Method Overriding is when a method is present in parent class, as well as in
		 * child class with the same name, and same no of arguments
		 */

		Automobile a = new Automobile();
		a.engine();// It can access its own method.
		// a.start();
		// Parent can't access child class. Through Parent class object you can't access
		// child class methods.
		System.out.println("******************");
		System.out.println("Top Casting or Dynamic Polymorphism");

		// Top Casting or Dynamic Polymorphism
		Car c1 = new BMW(); // small thing can be fit into big thing. Child can be fit into Parent.
		/*
		 * child class object can be referred by parent class reference variable which
		 * is called dynamic or run time polymorphism
		 */
		c1.start();// c1 is pointing to new BMW() object
		// over-ridden method will be called---Parent class reference variable can only
		// access common methods
		c1.stop();
		c1.refuel();
		c1.engine();

		System.out.println("************");
		// c1.theftsafety() //can not be referred, as it is not common in car class, and
		// BMW class
		// c1.theftsafety()

		System.out.println("***************");
		System.out.println("Down Casting");

		// Down Casting
		// BMW b1 = new Car(); Parent can not be fit into child calss reference,
		BMW b1 = (BMW) new Car();// query
		b1.engine();
		b1.start();
		b1.stop();
		b1.theftsafety();
		b1.refuel();
		// Casting ClassCastException Car cant be cast to BMW.
		// compile time it is fine, but in run time exception will occur.

	}

}
