package Stream.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("deepak saini");
		emp.allDevices("ON Next Galaxy Samaung Android");
		emp.allDevices("IPhone10");
		emp.allDevices("IPhoneX");
		emp.allDevices("Mac pro");
		emp.allDevices("Laptop");

		Employee emp1 = new Employee();
		emp1.setName("siya saini");
		emp1.allDevices("Lenovo window10");
		emp1.allDevices("Nokia");
		emp1.allDevices("Vivo");
		emp.allDevices("IPhoneX");

		List<Employee> empLists = new ArrayList<Employee>();
		empLists.add(emp);
		empLists.add(emp1);

		List<String> deviceList = empLists.stream().map(x -> x.getDevices()) // return Stream<Set<String>
				.flatMap(x -> x.stream())// return Stream<String>
				.distinct().collect(Collectors.toList());
		deviceList.forEach(x -> System.out.println(x));
	}

}
