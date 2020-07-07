package OOPSConceptPart1;

public class CallByValueAndCallByReference {

	int p;// class or global variable. Can I initialise here.
	int q;// class or global variable. Can I initialise here.

	public static void main(String[] args) {

		// Call by Value or Pass by Value as you are calling a function or method by
		// passing absolute values
		// as parameters, you are not passing any class references
		// Through the object of a class, you can access non-static methods, and
		// non-static variables
		// But to access static methods, or variables, you can access through class name

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		System.out.println(obj.testsum(x, y));

		System.out.println("****");

		obj.p = 50;// class variables are accessed through object of the class.
		obj.q = 60;

		// after swapping

		obj.swap(obj);// you are passing an object reference as parameter inside the swap() method

		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	// testsum() method is call by value method as you are calling a function by
	// passing two integer parameters any not references

	public int testsum(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}

	// swap() method is called call by reference as u are passing the class
	// reference not the absolute values

	public void swap(CallByValueAndCallByReference t) {

		// obj will given to t. obj and t will point to the same object as they are the
		// reference variable of the same class
		// and they will point to the same non static variables, non static functions
		// inside the object.

		int temp;
		temp = t.p;// t.p is same obj.p
		t.p = t.q;// t is only available inside this swap() method
		t.q = temp;

	}

}
