package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// wrapper class ---data conversion
		// Through wrapper class you can convert a string value to
		// integer/double/boolean using parseint() is the function
		// you can also convert integer value to string through valueof() function

		String s = "100";
		System.out.println(s + 20);
		int i = Integer.parseInt(s);
		System.out.println(i + 20);

		// double conversion

		String k = "12.35";
		System.out.println(k + 10);
		double d = Double.parseDouble(k);
		System.out.println(d + 20);

		// boolean conversion

		String t = "true";
		System.out.println(t);
		Boolean.parseBoolean(t);
		System.out.println(t);

		// int to string conversion.

		int w = 200;
		System.out.println(w);
		String f = String.valueOf(w);
		System.out.println(f + 10);

	}

}
