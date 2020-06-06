package StreamJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		/**
		 * Interface UnaryOperator<T>
		   Type Parameters:
		   T - the type of the operand and result of the operator
		 */
		//Represents an operation on a single operand that produces a result of the same type as its operand.
		//This is a specialization of Function for the case where the operand and result are of the same type.
		
		UnaryOperator<Integer> func = x -> x * 7;
		int rs=func.apply(10);
		System.out.println(rs);
		
		//using function interface
		Function<Integer,Integer> func1 = x -> x * 10;
		int result=func1.apply(10);
		System.out.println(result);
		
		List<String> langList=new ArrayList<String>();
		langList.add("java");
		langList.add("Ruby");
		langList.add("Python");
		System.out.println(langList);
		langList.replaceAll(ele -> ele + " deepak");
		System.out.println(langList);
		

	}

}
