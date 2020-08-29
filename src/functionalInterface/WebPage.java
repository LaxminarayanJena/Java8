package functionalInterface;

//SAM-Single abstract method
public interface WebPage {
	
	void header(String value);
	
	public static void test()
	{
		
	}
	default void display()
	{
		
	}
	     
	

}

/*
Functional interface introduced in 1.8
having only one abstract method
@Functional Interface

types of functional interface
unary operator
BinaryOperator
Function<T,R



*/