package OOPSConceptPart1;

public class StringConcept {

	public static void main(String[] args) {

		// why strings are immutable?

		String s1 = "Java";

		// In Java memory there is a separate area called method area to store strings
		// values as strings are immutable
		// its not like that for s1 one memory cell to store string java, and for s2
		// another memory cell

		String s2 = "Java";

		// one not two "java" named objects gets created. s1, and s2 both refer to the
		// same java object //

		s2 = "Selenium";// now s2 will point to selenium, but s1 still point to java not to selenium,

		// so strings are immutable and final

		String s3 = "Java";

		String s4 = "API Testing";

		System.out.println(s1);// string calss can't be inherited. no method overridding.
		System.out.println(s2);// hashCode will same
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1.hashCode());// same hascode for s1, and s3 so performance increases using hashMap
		System.out.println(s2.hashCode());// different hashCode
		System.out.println(s3.hashCode());// same hascode for s1, and s3 so performance increases using hashMap
		System.out.println(s4.hashCode());// different hashCode

		// strings are immutable and final because to enhance security, for optimization
		// and performance, and class loading mechanism

		// All Wrapper Classes - Integer, Long, Double, Float are also Immutable and
		// Final in nature

		System.out.println("****************************************************");

		int i = 2;// one memory cell to store the value of i unlike strings
		int j = 2;// another memory cell to store the value of j unlike strings
		j = 3;
		System.out.println(i);
		System.out.println(j);

	}

}
