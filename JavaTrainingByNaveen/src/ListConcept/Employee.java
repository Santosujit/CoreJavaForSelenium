package ListConcept;

public class Employee {
	String name;// Global Class Variable
	int age;// Global Class Variable
	String dept;// Global Class Variable

	Employee(String name, int age, String dept) { // Constructor. This.name and the upper name are different

		this.name = name;// Initialised Global variable. This line means Global variable is equal to
							// Local Variablethis.name=name;
		this.age = age;// If Global variable and local variable name are same, this keyword is used.
		this.dept = dept;

	}
}
