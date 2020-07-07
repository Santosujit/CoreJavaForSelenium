package OOPSConceptPart1;

public class LocalVsGlobalVariables {

	// non static global or class variables can only be accessed through object
	// reference.
	// object contains non static global variables, and non static methods.

	int age = 20;// Global or Class Variables
	String name = "santosh";// Global or Class Variables

	static int w = 100;

	public static void main(String[] args) {
		int i = 10; // i is the Local variable stored in stack memory
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();// object got created
		obj.sum();
		System.out.println(obj.age);
		System.out.println(obj.name);

		System.out.println(LocalVsGlobalVariables.w);// static variables are either called by classname or directly
		obj.Dabulu();// warning is coming
		LocalVsGlobalVariables.Dabulu();// no warning
	}

	public void sum() {
		int i = 15;// Local Variable
		int j = 10;// Local Variable
		System.out.println(i);

	}

	public static void Dabulu() {
		System.out.println("Priya");
	}
}
