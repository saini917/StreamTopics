package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Test {
	static int count = 0;
	ArrayList<String> names = new ArrayList<>();

	// @org.testng.annotations.Test
	public void regular() {
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("sandeep");
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println("count of Alphabet start with A --> " + count);
	}

	// @org.testng.annotations.Test
	public void streamFilter() {
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("sandeep");

		// there is no life for intermediate operation if there is no terminal
		// operation
		// terminal operation will execute only if intermediate
		// operation(filter) return true
		// we can create stream
		// how to use filter in Stream API

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("count of Alphabet start with A --> " + c);

		Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "sandeep").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// print all the names of arraylist

		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	// @org.testng.annotations.Test
	public void streamMap() {

		// print names which has last letter as "a" with uppercase
		/*
		 * Stream.of("Abhijeet","Dona","Alekhya","Adama","sandeep").filter(s->s.
		 * endsWith("a")).map(s->s.toUpperCase())
		 * .forEach(s->System.out.println(s));
		 */

		// print names which has first letter as "a" with uppercase and sorted

		List<String> names = Arrays.asList("Abhijeet", "Dona", "Alekhya", "Adama", "sandeep");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}

	//@org.testng.annotations.Test
	public void streamMergeList() {
		names.add("deepak");
		names.add("Dona");
		names.add("Reema");
		names.add("Adama");

		List<String> names1 = Arrays.asList("Abhijeet", "Dona", "Alekhya", "Adama", "sandeep");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase());

		// merging 2 different list
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s -> System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("adama"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
	
	@org.testng.annotations.Test
	public void streamCollect(){
		List<String> list=Stream.of("Abhijeet", "Dona", "Alekhya", "Adama", "sandeep").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(list.get(0));
		
		//print unique number from this array
		List<Integer> values = Arrays.asList(2,3,2,3,45,64,4,5,45,79,50);
		//values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		//sort the array -- 3rd index -1,2,3,5.7.9
		List<Integer> ls=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls.get(2));
	}

}
