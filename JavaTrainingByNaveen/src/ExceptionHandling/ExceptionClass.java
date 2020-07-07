package ExceptionHandling;

public class ExceptionClass {

	public static void main(String[] args) {
		ExceptionClass obj = new ExceptionClass();
		obj.sum();
		System.out.println("ABC");// ABC will be printed now

		// error (memory leakage) vs exception (code problem)
		// Throwable is a super class of Error and Exception
		// If error is thrown, then you can't handle using exception.
		// good practice is to write Throwable in catch block as you are not sure
		// whether its a error or exception

	}

	public void sum() {
		try {
			div();// sum()method is handling the exception thrown by div() method
		} catch (Exception e) {// All exceptions (Arithmetic or NullPointer)
								// are child class of Exception class. you can write Throwable
								// instead of Exception in the catch Block

			System.out.println("ABC");
		}
	}

	// If there are 100 lines of codes inside a method, suppose 40 lines of codes
	// are giving exception, then you need to write 40
	// try-catch blocks to catch the exception
	// to avoid it throws keyword is used

	public void div() throws Exception {// div() method will throws the Exception it to sum() method
		int i = 9 / 0;
	}

}
