package ExceptionHandling;

public class throwsKeyword {

	public static void main(String[] args) throws ArithmeticException {// this exception will take care of this
		// exception thrown by main() method
		throwsKeyword obj = new throwsKeyword();
		obj.sum();
		System.out.println("ABC");// ABC will not be printed

	}

	public void sum() throws ArithmeticException {// sum() method will catch the exception thrown by div() method,
		// sum() method throws it to main() method. JVM will handle it sum() is calling
		// method
		div();// called method
	}

	// If there are 100 lines of codes, suppose 40 lines of codes are giving
	// exception
	// you need to write 40 try-catch blocks
	// to avoid it throws keyword is used

	public void div() throws ArithmeticException {// div() method will catch the exception, and throws it to sum()
													// method
		int i = 9 / 0;// exception line
		// it will show exception hierarchy
		// using throws keyword it will terminate,
	}

}
