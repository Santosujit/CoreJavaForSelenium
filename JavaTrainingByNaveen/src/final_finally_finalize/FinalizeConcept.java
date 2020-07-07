package final_finally_finalize;

public class FinalizeConcept {
	// just before garbage collectior finalize method will be called. finalize
	// method will be automatically called.

	public void finalize() {
		System.out.println("finalze method");
	}

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1 = null;// the f1 object will have no reference. The object will be destroyed by garbage
					// collector.
		f2 = null;// the f2 object will have no reference The object will be destroyed by garbage
					// collector.

		System.gc();// you can call the garbage collection manually like this.

	}

}
