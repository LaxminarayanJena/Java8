package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorConcept {

	public static void main(String[] args) {
	
   /*Represents an operation upon two operands of the same type, producing a result of the same type as the operands
    * 
    */ 
		BinaryOperator<Integer> func =(x1,x2) ->x1+x2;
		int t=func.apply(10, 20);
		System.out.println(t);
		
		BiFunction<Integer,Integer,Integer> func1=(x1,x2) -> x1+x2;
		int result =func1.apply(30, 40);
		System.out.println(result);
	}

}
