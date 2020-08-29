package functionalInterface;

import java.util.function.Function;

public class InterfaceFunction {
	
	/*Interface Function<T,R>Type Parameters:
	 * T- the type of the input to
	 * R- the type of result of function
	 */

	public static void main(String[] args) {
		
		
		Function<String,Integer> func =x->x.length();
		int len=func.apply("This is java8");
		System.out.println(len);
		
		
		//chaining function
		Function<Integer,Integer> func2 =x->x*2;
		int result=func.andThen(func2).apply("hello jena");		
		System.out.println(result); //10*2=20;
	}

}
