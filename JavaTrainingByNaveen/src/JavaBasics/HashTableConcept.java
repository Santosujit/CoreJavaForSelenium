package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	// Hashtable is a two dimensional dynamic array
	// It has put(), get(),size() methods

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, 100);
		h.put("A", 1100);
		h.put('A', 200);
		h.put(2, "Hello");
		System.out.println(h.size());
		System.out.println(h.get('A'));
		System.out.println(h.get("A"));
		System.out.println(h.get(1));

		// Restriction
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		// h1.put("A", 199); Not allowed

	}

}
