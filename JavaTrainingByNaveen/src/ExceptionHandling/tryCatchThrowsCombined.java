package ExceptionHandling;

public class tryCatchThrowsCombined {

	public static void main(String[] args) {
		tryCatchThrowsCombined obj = new tryCatchThrowsCombined();
		obj.sum();
		System.out.println("ABC");// ABC will be printed now

		// error (memory leakage) vs exception (code problem)
		// Throwable is a super class of Error and Exception
		// If error is thrown, then you can't handle using exception.
		// good practice is to write Throwable in catch block
		// All exceptions are child class of Exception class

	}

	public void sum() {
		try {
			div();// sum()method is handling the exception thrown by div() method
		} catch (ArithmeticException e) {
			System.out.println("ABC");
		}
	}

// If there are 100 lines of codes, suppose 40 lines of codes are giving
// exception
// you need to write 40 try-catch blocks
// to avoid it throws keyword is used

	public void div() throws ArithmeticException {// div() method will catch the exception, and throws it to sum()
// method
		int i = 9 / 0;
	}

}