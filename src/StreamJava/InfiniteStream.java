package StreamJava;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		//Infinite Stream is used to  generate infinite stream of data
		// Two ways: 1) iterate()
		// static(T seed, UnaryOperator<T> f)
		//return a stream --> Stream<T>
		
		List<Integer> collect=IntStream.iterate(0, n -> n+2)
		         .mapToObj(Integer::valueOf)
		         .limit(10)
		         .collect(Collectors.toList());
		System.out.println(collect);
		
		// 2) generate()
		//static generate(Supplier<T> s)
		//to generate random number -- 100
		
		List<Integer> collect1=Stream.generate(() -> (new Random()).nextInt(200))
				              .limit(10)
				              .collect(Collectors.toList());
		System.out.println(collect1);
		
	}

}
