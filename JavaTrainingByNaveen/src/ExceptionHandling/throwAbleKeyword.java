package ExceptionHandling;

public class throwAbleKeyword {

	public static void main(String[] args) {
		throwAbleKeyword obj = new throwAbleKeyword();
		obj.sum();
		System.out.println("ABC");// ABC will be printed now

// Throwable is the super class of error and exception.  And object is the super class of Throwable.

	}

	public void sum() {
		try {
			div();// sum()method is handling the exception thrown by div() method
		} catch (Throwable th) {
			System.out.println("ABC");
		}
	}

	public void div() throws Exception {
		int i = 9 / 0;
	}

}
