package ListConcept;

import java.util.ArrayList;
import java.util.*;

public class ArrayListConcept {

	public static void main(String[] args) {

		int a[] = new int[3];// This is a static array---size is fixed. here size is 3, u can store three
								// values in this array.

		// Example of one dimensional Dyanamic Array is---ArrayList
		// It maintains insertion order. 1st element will be entered in index 0, then 1
		// etc.
		// It is not synchronised. Many Threads can access it at a time. Not Threadsafe.
		// It is slow in comparision to other collection.
		// allows random access to fetch any element because it stores the values on the
		// basis of indexes.

		// Methods Present ---
		// add()/size()/get()/iterator()/hasNext()/next()/retailAll(),addAll()/removeAll()

		ArrayList ar = new ArrayList();

		// add() method and size() method

		ar.add(10);// 0, 10 will be added in 0th element of the arrayList
		ar.add("Santosh");// 1
		ar.add('W');// 2
		System.out.println(ar.size());// 3
		ar.add(true);// 3
		ar.add(false);// 4
		ar.add(false);// 5 ---You can store duplicate values too.
		System.out.println(ar.size());// 6

		// get() method

		System.out.println(ar.get(2));// to get value present in any index---'W'
		System.out.println(ar.get(4));// false

		System.out.println("*******");

		// to print all the values from ArrayList---use for loop.

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		System.out.println("**********************");

		// non-generics vs generics
		// yellow line --- warning

		ArrayList<Integer> ar1 = new ArrayList<Integer>();// Only you can store Integer values in this ArrayList
		ar1.add(10);
		// ar1.add("Naveen");//It will not let you add as ar1 is defined with Integer.
		// Generics in Java

		// You can store different user defined class objects in ArrayList.
		// Employee Class Objects

		Employee e1 = new Employee("Naveen", 27, "QA");
		Employee e2 = new Employee("Santosh", 30, "Testing");
		Employee e3 = new Employee("Tiki", 31, "Business");

		// create an ArrayList

		ArrayList<Employee> ar4 = new ArrayList<Employee>();// I want to store Employee objects in this arraylist
															// not integer or string
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values

		Iterator<Employee> it = ar4.iterator();// iterator() method returns a reference variable which'll be stored in
												// "it"
												// ar4 is the object reference variable of ArrayList, but it is the
												// object reference variable of Iterator Class
												// iterator don't work on indexes as these are objects.

		// Traversing the Iterator---query

		while (it.hasNext()) {
			Employee emp = it.next();
			/*
			 * Employee type iterator will be created in Java memory. hasNext() checks
			 * whether there is 1st value there or not, next(0) method points to the 1st
			 * cell in the iterator
			 */
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*******************");

		// addAll() method---Used to append two ArrayList

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("Java");
		ar5.add("TestNG");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("QTP");
		ar6.add("JavaScript");
		ar6.add("Tina");

		ar5.addAll(ar6); // All the values in ar6 object will be stored in ar5 object

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("*******************");

		// removeAll()---

		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("*******************");

		// retainAll()---check the common part

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("QTP");
		ar7.add("JavaScript");
		ar7.add("TestAutomatioArchiTect");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Santosh");
		ar8.add("Lovely");
		ar8.add("TestAutomatioArchiTect");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}

	}

}
