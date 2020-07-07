package OOPSConceptPart1;

public class Car {

	int mod;// class variable or Global variable. A copy of these variables are given to
			// each object.
	int wheel;

	public static void main(String[] args) {

		// new keyword is used to create object inside the class.
		// Objects are stored inside Heap memory, which is larger than stack memory
		// Local variables are stored in Stack memory

		Car a = new Car();// new Car () is the object. a is the reference variable of type Car class
							// referring to new Car () object
		Car b = new Car();// Another object got created
		Car c = new Car();

		a.mod = 2019;// through object reference a we are able to access class cariable
		a.wheel = 4;

		b.mod = 2020;
		b.wheel = 4;

		c.mod = 2021;
		c.wheel = 6;

		System.out.println(a.mod);
		System.out.println(c.wheel);

	}

}
