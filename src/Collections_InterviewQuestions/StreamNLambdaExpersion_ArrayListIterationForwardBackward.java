package Collections_InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StreamNLambdaExpersion_ArrayListIterationForwardBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tvShows=new ArrayList<String>();
		tvShows.add("BBT");
		tvShows.add("Friends");
		tvShows.add("Prision Braker");

	//1. Iterating ArrayList using foreach & lambda function.
		tvShows.forEach(shows -> {
			System.out.println(shows);
		});
	
		System.out.println("________________________________");
		
	// 2. Using Iterator
		Iterator<String> itShows=tvShows.iterator();
		while(itShows.hasNext()) {
			String shows=itShows.next();
			System.out.println(shows);
		}
		System.out.println("________________________________");
		
	//3. Using iterator and java 8 forEachRemaning() method	
		tvShows.iterator().forEachRemaining(show->{
			System.out.println(show);
		});
		System.out.println("________________________________");
	//4. Using for each loop
		for (String show : tvShows) {
			System.out.println(show);
		}
		
	// 5. Using listIterator => to traverse in both direction
		ListIterator<String> tvSeriasListIterator=tvShows.listIterator(tvShows.size());
		while(tvSeriasListIterator.hasPrevious()) {
			String show=tvSeriasListIterator.previous();
			System.out.println(show);
		}
	}
}
