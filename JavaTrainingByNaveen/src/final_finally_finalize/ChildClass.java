package final_finally_finalize;

public class ChildClass extends ParentClass {
	public void start() {
		// start() method is present in both child and parentv class. It is called
		// method overriding.
		System.out.println("child---start method");
	}

	public static void main(String[] args) {

		ChildClass ch = new ChildClass();
		ch.start();
	}
}
