package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();

		tvSeries.add("The Kapil Sharma Show");
		tvSeries.add("Deepak Chopra Talks");
		tvSeries.add("OSHO Talks");
		tvSeries.add("Discovery Channel");
		tvSeries.add("Hindi Music");

		// 1 --- Iterate using Java 8 For each loop and lambda expression---Query
		System.out.println("---Print using foreach loop with lambda expression in java 8---");

		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});// shows is presenting tvSeries elements

		// Using simple Iterator
		System.out.println("---Print using simple Iterator---");

		Iterator<String> it = tvSeries.iterator();// tvSeries.iterator() will return
		while (it.hasNext()) {
			String shows = it.next();// it.next() will return a String
			System.out.println(shows);
		}

		// Using Iterator and java 8 lambda and foreachremaining() method
		System.out.println("--- Print Using Iterator and java 8 lambda and foreachremaining() method---");
		it = tvSeries.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});

		// Using for each loop
		System.out.println("---Print using for each loop---");
		for (String shows : tvSeries) {
			System.out.println(shows);
		}

		// Using for loop with order or index
		// tvSeries is the ArrayList name
		System.out.println("---Print using for loop with order or index---");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// Using a listIterator() to traverse in both direction---Query
		// tvSeries is the ArrayList name
		System.out.println("---Print Using a listIterator() to traverse in both direction---");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());// tvSeries.listIterator(tvSeries.size()
																							// will return
																							// ListIterator<String>
		while (tvSeriesListIterator.hasPrevious()) {
			String shows = tvSeriesListIterator.previous();
			System.out.println(shows);
		}
	}

}
