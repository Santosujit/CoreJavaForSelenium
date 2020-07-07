package abStractionConcept;

public class Test extends Shape {

	public static void main(String[] args) {

		// Shape s=new Shape();//you can't create object of abstract class or interface

		Shape s = new Test();// s is the parent class object reference variable referring to child class Test
								// object

		s.fill();
		s.drawing();
		System.out.println(s.shape);

		Test t = new Test();
		t.fill();
		t.drawing();

		System.out.println(t.shape);

	}

	@Override
	void drawing() {
		System.out.println("Parent Class Drawing method is overridden in Child Class");

	}

}
