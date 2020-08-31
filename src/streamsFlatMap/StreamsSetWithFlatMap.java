package streamsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("jena");
		
		emp1.addDevices("iphone");
		emp1.addDevices("samsung");
		emp1.addDevices("iphone");
		emp1.addDevices("realme");
		
		Employee emp2 = new Employee();
		emp2.setName("tom");
		
		emp2.addDevices("dell");
		emp2.addDevices("mac");
		emp2.addDevices("hp");
		emp2.addDevices("asus");
		
		List<Employee> empLists = new ArrayList<Employee>();
		
		empLists.add(emp1);
		empLists.add(emp2);
		
	List<String> deviceList=	empLists.stream()
		.map(x->x.getDevices()) //Stream<Set<String>>
		.flatMap(x->x.stream())//Stream<String>
		.distinct()
		.collect(Collectors.toList());
	
	deviceList.forEach(x->System.out.println(x));
		
		
		

	}

}
