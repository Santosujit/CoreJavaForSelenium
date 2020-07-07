package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConceptNew {

	public static void main(String[] args) {

		// HashTable is similar to HashMap, but it is synchronised. sequential
		// threading. Thread Safe, at a time only.one thread can access a particular
		// object
		// stores the value on the basis of key and value
		// every key will be specified as an object, and each and every object will have
		// unique HashCode
		// whenever u create an object, JVM gives a unique signed 32 bit code called as
		// hashCode
		// if two objects are equal (cloning), then same hashCode for both the objects

		Hashtable h1 = new Hashtable();
		h1.put(1, "Java");
		h1.put(2, "Selenium");
		h1.put(3, "API Automation");
		h1.put(3, "API Automation");// It contains unique values, not duplicate even if you add it
		System.out.println("Values from h1 object " + h1);

		// Cloning
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("Values from Hashtable h1 " + h1);
		System.out.println("Values from Hashtable h2 " + h2);
		// clear
		h1.clear();
		System.out.println("Values from Hashtable h1 " + h1);
		System.out.println("Values from Hashtable h2 " + h2);
		// containsof method
		Hashtable str = new Hashtable();
		str.put("A", "Bapa");
		str.put("B", "Mama");
		str.put("C", "Baboo");
		if (str.containsValue("Mama")) {
			System.out.println("Mama I love you the most");
		}

		// print all the values from Hashtable using --- Enumeration --- elements()
		Enumeration e = str.elements();// str.elements() will store all the values of str object
		System.out.println("Print values from str using enumeration");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from Hashtable using entrySet() ---set of hashtable values
		System.out.println("Print values from str using entrySet");
		Set s = str.entrySet();// str.entrySet() will return one Set object reference
		System.out.println(s);

		// equals method to check if two hashtables are equal
		Hashtable str1 = new Hashtable();
		str1.put("A", "Bapa");
		str1.put("B", "Mama");
		str1.put("C", "Baboo");
		// str1.put(null, "Baboo");//no null key or null values allowed---nullPointer
		// Exception
		str1.put("D", null);// no null key or null values allowed
		// But in HashMap Null key or null values are allowed
		if (str.equals(str1)) {
			System.out.println("Both the Hashtables are equal");
		}
		// get the value from a key
		System.out.println(str1.get("B"));
		// how to get hashCode of a hashtable Object
		System.out.println("The hashcode value of str1 " + str1.hashCode());
		System.out.println("The hashcode value of str " + str.hashCode());// as both the hashcode objects are equal
		// generics
		Hashtable<String, String> str3 = new Hashtable<String, String>();

	}

}
