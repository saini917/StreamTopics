package StreamJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	public static void main(String st[]){
		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Game of Throne");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. using java 8 with for each loop and lamdba expression
		System.out.println("....print using for each loop with lamda in java 8......");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("....print using iterator......");
		//2. using iterator
		Iterator<String> it=tvSeries.iterator();
		while(it.hasNext()){
			String shows=it.next();
			System.out.println(shows);
		}
		
		
		System.out.println("....print using iterator and java 8 lambda and forEachReamining() 	method......");
		//3. using iterator and java 8 forEachReamining() method
		it=tvSeries.iterator();
		it.forEachRemaining(shows -> {
		System.out.println(shows);
		});
		
		System.out.println("....print using for each loop......");
		//4. using for each loop
		for(String shows:tvSeries){
			System.out.println(shows);
		}
		
		System.out.println("....print using for loop with index/order......");
		//5. using for loop with index/order
		for(int i=0;i<tvSeries.size();i++){
			System.out.println(tvSeries.get(i));
		}
		
		System.out.println("....print using a listIterator() to traverse in both the directions......");
		//6. using a listIterator() to traverse in both the directions
		
		ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()){
			String shows=tvSeriesListIterator.previous();
			System.out.println(shows);
		}
		
	}

}
