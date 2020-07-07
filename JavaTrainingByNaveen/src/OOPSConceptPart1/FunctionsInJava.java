package OOPSConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();

		// obj is referring to the object new FunctionsInJava()
		// one object is created. obj is the reference variable referring to this
		// object.
		// after creating the object, the copy of all non-static methods will be given
		// to this object.
		// for example naveen is the object reference, we access different functions
		// through it.
		// naveen walk, naveen write, naveen sleep etc.
		// return type of a function or method can be void/integer/String

		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String s1 = obj.qa();
		System.out.println(s1);
		int div = obj.division(120, 40);
		System.out.println(div);
	}

	// non static methods

	// return type --void
	// void -- doesn't return any value

	public void test() {// no input, no output
		System.out.println("test method");
	}

	// return type is int

	public int pqr() {// no input, some output (return type is there)
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// return type -- String

	public String qa() {// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;
		return d;
	}
}
