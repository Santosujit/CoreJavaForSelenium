package ExceptionHandling;

public class tryCatchBlock {

	public static void main(String[] args) {

		// try-catch block
		// can be used for reporting purpose

		try {
			int i = 9 / 0;// the code which is giving exception we have to write that inside try block
							// like this.
							// if u don't write try-catch block, program "ll terminate at that line , here
							// ABC "ll not be printed
		} catch (ArithmeticException e) {
			// You could have written the Excepton (super class) instead of
			// ArithmeticException
			// e.fillInStackTrace();// it will not terminate the program, but will tell u
			// about the exception
			System.out.println(e.getMessage());// it will give the actual error
			System.out.println("hey--this is divide by zero error");// own message
		}

		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}