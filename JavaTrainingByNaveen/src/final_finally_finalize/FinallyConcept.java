package final_finally_finalize;

public class FinallyConcept {

	public static void main(String[] args) {

		// final is a keyword, finally is a block, and finalize is a method
		// final variable---you can't change the value of the variable
		// final method()---you can't override the method in the child class
		// final class---you can't inherit the parent class

		// finally code is always executed even if there is exception or no exception.
		// finally code is always executed with try catch block

		// direct calling without object creation is possible as it is a static method
		// methods can be called directly inside main method
		// try and catch are both block, used in Exception Handling

		test1();
		test2();
		division();
		division1();

	}

	// Below there is exception still finally block of code will be executed

	public static void test1() {
		try {
			System.out.println("Inside test1 Method");
			throw new RuntimeException();// manually throwing an Exception

		} catch (Exception e) {
			System.out.println("Inside test1 method Catch Block");
		} finally {
			System.out.println("Inside test1 method finally Block");
		}
	}

	// Below there is no exception still finally block of code will be executed

	public static void test2() {
		try {
			System.out.println("Inside test2 Method");

		} finally {
			System.out.println("Inside test2 method finally Block");
		}
	}

	// real time exception still finally block of code will be executed

	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside Division Method's try Block ");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("Inside Division Method's Catch Block");
			System.out.println("Division by Zero is not possible in Java");
		} finally {
			System.out.println("Finally Code will be executed even after run time exception");
		}
	}

	// real time exception but catch block still finally block of
	// code will be executed

	public static void division1() {
		int i = 10;
		try {
			System.out.println("Inside Division1 Method's try Block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("Inside Division1Method's Catch Block");// exception will be thrown but it will skip the
																		// catch block as It is not a
																		// NullPointerException
																		// It is an arithmeticexception
			System.out.println("Division by Zero is not possible in Java");
		} finally {
			System.out.println("Finally Code will be executed even after run time exception");
		}
	}
}
