package StreamJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		Predicate<Integer> func = x -> x > 5;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colList);
		
		
		//predicte with &&:
		List<Integer> colList1=list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
		System.out.println(colList1);
		
		//predicate with negate()
		List<String> nameList=Arrays.asList("deepak","deep","deepa","dee","de","java","jav","ja","j");
		Predicate<String> namesExp = x -> x.startsWith("de");
		List<String> newList=nameList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
