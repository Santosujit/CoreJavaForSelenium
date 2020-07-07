package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Selenium");
		ll.add("APITesting");
		ll.add("Appium");
		ll.add("SQL");
		ll.add("UNIX");

		// print
		System.out.println("Contents of LinkedList are" + ll);// ---Query

		System.out.println("*******************************");
		// addFirst
		ll.addFirst("Performance Testing");
		// addLast
		ll.addLast("Infosys");
		System.out.println("Contents of LinkedList are" + ll);
		// get
		System.out.println(ll.get(2));
		// set
		ll.set(2, "Infosys");
		System.out.println(ll.get(2));
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList are" + ll);
		ll.remove(3);
		System.out.println("Contents of LinkedList are" + ll);
		ll.set(3, "SQL");
		System.out.println("Contents of LinkedList are" + ll);
		ll.addLast("UNIX");
		System.out.println("Contents of LinkedList are" + ll);
		// How to Print all the values of the LinkedList
		// Using For Loop
		System.out.println("Using for Loop");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		// Using Advanced For Loop---Query
		System.out.println("Using advanced for Loop");
		for (String str : ll) {
			System.out.println(str);
		}
		// Using Iterator
		System.out.println("Using Iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Using While Loop
		System.out.println("Using while loop");
		int num = 0;
		while (ll.size() > 0) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
