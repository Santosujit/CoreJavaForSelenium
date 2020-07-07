package ExceptionHandling;

public class throwKeyword {

	public static void main(String[] args) {

		// some exceptions are not there in Java
		// you create your own exception and throw it, so throw keyword is used

		System.out.println("ABC");

		try {
			throw new Exception("Santosh Exception");// deliberately you are throwing your own exception
		} catch (Exception e) {
			e.printStackTrace();// It will show the exception in red
			// System.out.println(e.getMessage());
		}

		System.out.println("PQR");

	}

}