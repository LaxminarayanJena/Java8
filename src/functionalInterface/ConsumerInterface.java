package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		//Represents an opeartion that accepts a single input argument and returns no result.
		 
		Consumer<String> func=x->System.out.println(x);
		func.accept("hello");
		
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.forEach(x ->System.out.println(x));

	}

}
