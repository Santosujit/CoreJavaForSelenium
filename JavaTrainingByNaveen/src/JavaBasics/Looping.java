package JavaBasics;

public class Looping {

	public static void main(String[] args) {
		int i = 1;
		// To print 1 to 10 using while loop
		
		System.out.println("To print 1 to 10 using while loop");
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		System.out.println("****");
		// To print 1 to 10 using for loop
		System.out.println("To print 1 to 10 using for loop");
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("****");
		// To print 10 to 1
		
		System.out.println("To print 10 to 1 using for loop");
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}

	}

}
