package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// stores values in the form of key, and value, pair wise
		// HasMap is a class which implements Map Interface.
		// HashMap is a class which extends AbstractMap
		// It contains only unique elements
		// it may have one null key, and multiple null values
		// it maintains no order
		// non synchronised,HashMap Object Can be accessed by multiple threads at a
		// time. Not thread safe
		// HashTable is synchronised
		// synchronised means one by one access at a time.One thread is released then
		// next thred can access the object
		// HashMap is used in Multithreading environment where you want to improve
		// performance.
		// key is not equal to index

		// Methods Present --- put()/get()/

		HashMap<Integer, String> hm = new HashMap<Integer, String>();// Generics
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "JMeter");
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));// no indexoutofbound exception as Hasmap does not store elements in terms of
										// indexes

		// Traverse or Iterate the HashMap
		// Entry is an Interface used to traverse the Hashmap
		// Entry is representing Map.Entry
		// hm.entrySet() will store the complete set of values which is available under
		// this HashMap

		// Entry Set and Entry Concept---Query

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println("*********");

			// remove
			System.out.println(hm);// before removal
			hm.remove(3);
			System.out.println(hm);// 3 is gone, doesn not maintain order

			// you can store Java objects references from Employee.Java
			HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

			Employee e1 = new Employee("Santosh", 28, "Accenture");// Constructor
			Employee e2 = new Employee("Naveen", 26, "Walmart labs");// Constructor
			Employee e3 = new Employee("Arup", 27, "ORACLE USA");// Constructor

			emp.put(1, e1);
			emp.put(2, e2);
			emp.put(3, e3);// Different employees e1,e2,e3 are stored in this particular HashMap Object

			// Iterate/Traverse the HashMap
			// emp is the HashMap object name

			for (Entry<Integer, Employee> m1 : emp.entrySet()) {
				int key = m1.getKey();// get the key first
				Employee e = m1.getValue();// getValue will return Employee so store them in Employee variable
				// entire getValue will be stored in particular e, and m.getvalue() representing
				// all three employees , pointing to all three employee objects
				// emp.entrySet() will be stored in m1
				System.out.println("Employee" + key + "Info");
				System.out.println(e.name + "" + e.age + "" + e.dept);
				// Entry is an Interface used to traverse the Hashmap

			}

		}

	}

}
