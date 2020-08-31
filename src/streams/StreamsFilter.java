package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilter {

	public static void main(String[] args) {
		
		//list of customer objects
		
		List<Customer> customerList =Arrays.asList(
				new Customer("Tom",30),
				new Customer("Toma",33),
				new Customer("Tomu",31),
				new Customer("Tomi",34),
				new Customer("Toms",35)
				
				
				);
		//filter -findAny
		Customer customer =customerList.stream() //convert list to stream
		.filter(x->"Toma".equals(x.getName())) //filter it for peter
		.findAny()
		.orElse(null);
		System.out.println(customer.getName() + "-"+ customer.getAge());
		
		//filter - did not findAny
				Customer customer1 =customerList.stream() //convert list to stream
				.filter(x->"Tomasa".equals(x.getName())) //filter it for peter
				.findAny()
				.orElse(null);
				System.out.println(customer1);
		
		//filter with multiple conditions:
		
		
	Customer customer2=customerList.stream()
		.filter((x)->"Toma".equals(x.getName()) && 33 ==x.getAge())
	.findAny()
	.orElse(null);
		
	System.out.println(customer2.getName() + " " +customer2.getAge());
		
				

	}

}
