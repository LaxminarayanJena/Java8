package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
        list.stream().map(number -> number * 3).forEach(System.out::println); 
        
        List<Integer> even = list.stream()
                .map(s -> Integer.valueOf(s))
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
          System.out.println( even); //[6, 12]

        
		List<Customer> customerList =Arrays.asList(
				new Customer("Tom",30),
				new Customer("Toma",33),
				new Customer("Tomu",31),
				new Customer("Tomi",34),
				new Customer("Toms",35)
				
				
				);
		
	String name=	customerList.stream()
		.filter(x->"Toma".equals(x.getName()))
		.map(Customer::getName)
		.findAny()
		.orElse(null);
	System.out.println(name);
	
	//print all the names from list
	
	List<String> custList=customerList
			.stream()
			.map(Customer::getName)
			.collect(Collectors.toList());
	custList.forEach(System.out::println);
	
	

	}

}
