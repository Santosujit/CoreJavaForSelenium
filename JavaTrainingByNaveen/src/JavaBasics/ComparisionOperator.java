package JavaBasics;

public class ComparisionOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b & a > c) {
			System.out.println("a is the largest of the three numbers");
		} else if (b > c) {
			System.out.println("b is the largest of the three numbers");
		} else {
			System.out.println("c is the largest of the three numbers");
		}
	}

}
