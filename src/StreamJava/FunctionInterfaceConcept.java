package StreamJava;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	//https://devdocs.io/openjdk~8/java/util/function/function
	// Functional interface in JDK 1.8
	// having only one abstract method
	// @FunctionalInterface introduced in 1.8
	// functional interface allowed only one abstract method
	// functional interface allowed static and default method
	public static void main(String[] args) {
		/**
		 * Interface Function<T,R>
           Type Parameters:
           T - the type of the input to the function
           R - the type of the result of the function
		 */
		Function<String, Integer> func = x -> x.length();
		int len = func.apply("This is java8 and i am learing");
		System.out.println(len);
		
		//chaining function
		Function<Integer, Integer> func1 = x -> x * 2;
		int result=func.andThen(func1).apply("this is deepak here");
		System.out.println(result);
	}

}
