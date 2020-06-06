package StreamJava;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		// take no argument and  return a result
		
		getText(() -> "java");
		getText(() -> "Naveen");
		getText(() -> "Test Automation");
		getText(() -> "QA");
		

	}
	
	public static void getText(Supplier<String> text){
		System.out.println(text.get().length());
		
	}

}
