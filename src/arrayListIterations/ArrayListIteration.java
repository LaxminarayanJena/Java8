package arrayListIterations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("got");
		tvSeries.add("sot");
		tvSeries.add("dot");
		tvSeries.add("tot");
		tvSeries.add("sot");
		
		//1/Using java 8 with for each loop and lambda expression
		
		System.out.println("Using java 8 with for each loop and lambda expression");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		//2.Using iterator
		System.out.println("Using iterator");
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext())
		{
			String shows =it.next();
			System.out.println(shows);
		}
		
		
		//3.using iterator and java8 forEachRemaining method
		System.out.println("using iterator and java8 forEachRemaining method");
		it=tvSeries.iterator();
		it.forEachRemaining(show -> System.out.println(show));
		
		//4.Using for each loop
		System.out.println("Using for each loop");
		for(String show:tvSeries)
		{
			System.out.println(show);
		}
		
		//5.Using for loop with order/index
		System.out.println("Using for loop with order/index");
		for(int i=0;i<tvSeries.size();i++)
		{
			System.out.println(tvSeries.get(i));
		}
		
		//6.Using  a listIterator() to traverse in both the directions
		System.out.println("Using  a listIterator() to traverse in both the directions");
		
		ListIterator<String> tvSeriesListIterator =tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious())
		{
			String show=tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
		

	}

}
