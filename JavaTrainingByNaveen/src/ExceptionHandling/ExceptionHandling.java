package ExceptionHandling;

public class ExceptionHandling {

	// Query---Entire Program

	// int w = 100;

	// 3rd way
	// static ExceptionHandling e;

	public static void main(String[] args) {
		// uncaught exception

		/*
		 * compliler is not throwing any error. it is not able to catch the exception.
		 * but in run time you will get the exception
		 */

		// int i = 9 / 0;
		// System.out.println(i);

		// caught exception

		// Thread.sleep(2000);

		// 1st way
		// NullPointerException

		// ExceptionHandling e = null;

		// 2nd way
		ExceptionHandling e = new ExceptionHandling();
		e = null;// objectReference cancellation

		// System.out.println(e);
		// System.out.println(e.w);

	}

}
