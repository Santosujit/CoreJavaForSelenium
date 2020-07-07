package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();// one dimensional dyanamic array, any data types can be stored

		// Threee methods are there add()/remove()/get() method

		// add() method

		ar.add(10);// add method
		ar.add("Tom");
		ar.add(100);
		ar.add('A');
		ar.add(10.24);

		System.out.println(ar.size());// will give the size of the dynamic array ar
		System.out.println(ar.get(0));

		// remove() method

		ar.remove(0);// removing the value from a particular index---remove() method
		System.out.println(ar.get(0));
		System.out.println(ar.size());

		// get() method

		System.out.println(ar.get(2));// value at the particular index of the dynamic array

		// To print all the values of the arrayList ---Use for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Interger ArrayList

		ArrayList<Integer> ar1 = new ArrayList<Integer>();// Only Integer can be added
		ar1.add(10);

		// ar1.add(100.14); Only Integer can be added

	}

}
