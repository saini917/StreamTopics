package Stream.FlatMap;

import java.util.Arrays;


public class StreamStringArrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][]=new String[][]{
			{"a","b"},
			{"c","d"},
			{"e","f"}
			};
			
			
			/*Stream<String[]> dataStream=Arrays.stream(data);
			
			//apply flatmap on dataStream
			Stream<String> streamFlatMap=dataStream.flatMap(x -> Arrays.stream(x));
			//Stream<String[]> dataStreamFilter=dataStream.filter(x -> "a".equals(x.toString()));
			Stream<String> dataStreamFilter=streamFlatMap.filter(x -> "c".equals(x.toString()));
			dataStreamFilter.forEach(System.out::println);*/
			
			
			Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "c".equals(x.toString()))
			.forEach(System.out::println);
			
		
	}

}
