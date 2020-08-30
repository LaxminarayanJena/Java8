package functionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {
	
	public static void main(String[] args) {
		//takes no argument and return a result
		
		getText(()->"Java");
		
	}
	
	public static void getText(Supplier <String> text)
	{
		System.out.println(text.get());
		System.out.println(text.get().length());
	}
	

}
