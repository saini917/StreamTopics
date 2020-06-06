package StreamJava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOpearotorInterfaceConcept {
	//Represents an operation upon two operands of the same type, 
	//producing a result of the same type as the operands. 
	//This is a specialization of BiFunction for the case 
	//where the operands and the result are all of the same type.
	
	public static void main(String st[]){
		BinaryOperator<Integer> func=(x1,x2)-> x1+x2;
		int sum=func.apply(10, 30);
		System.out.println(sum);
		
		//Bifunction interface
		BiFunction<Integer,Integer,Integer> func1=(x1,x2)-> x1+x2;
		int rs=func.apply(40, 30);
		System.out.println(rs);
	}

}
