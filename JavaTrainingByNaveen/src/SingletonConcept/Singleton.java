// In OOP, a singleton class is a class that can have only one object or
// instance of the class at a time
//If you create more objects, then it will point to the same object
// How to design Singleton Class in Java---see below
// 1.Make sure Constructor of that class as private
// 2.Write a public static method names (getInstance) that has return type object of this Singleton
// class(Lazy Initialisation)

package SingletonConcept;

public class Singleton {

	private static Singleton s = null;
	public String str;

	private Singleton() {
		str = "Hey I am using singleton class pattern";
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();// Object Creation
		return s;
	}

	public static void main(String[] args) {

		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		Singleton s3 = new Singleton();// s1,s2,s3 all points to the same object

		s1.str = (s1.str).toUpperCase();// s1 is object reference of Singleton class, so it access Singleton class
										// variable str

		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);

		System.out.println("********");

		s3.str = (s3.str).toLowerCase();
		System.out.println(s1.str);// query---why it is coming in caps
		System.out.println(s2.str);
		System.out.println(s3.str);

	}

}
