package OOPSConceptPart1;

public class StaticAndNonStaticVariables {

	// Global or Class variable

	String name = "Tom Aron";// String is a class so starts with caps
	static int w = 100;// static variable. integer type but static in nature

	public static void main(String[] args) {

		// how to call static variables, and static method
		// directly or by class name as they are not inside object, freely available in
		// Java memory

		System.out.println(w);
		sum();

		System.out.println(StaticAndNonStaticVariables.w);
		StaticAndNonStaticVariables.sum();

		// how to access non-static variables, and non-static methods
		// through object reference

		StaticAndNonStaticVariables obj = new StaticAndNonStaticVariables();
		System.out.println(obj.name);
		obj.sendMail();

		// can I access static functions and variables through object reference
		// Yes, but not a good programming practice
		System.out.println(obj.w);
		obj.sum();

	}

	public void sendMail() {
		System.out.println("send mail");
	}

	public static void sum() {
		System.out.println("sum method which is static in nature");
	}

}
