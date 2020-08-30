package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	//Represents an opearation on a single operand that produces a result of the same type as its operand.This is a specialisation
	//of Function for the case where the opernd and result are of same type
	public static void main(String[] args) {
		
		UnaryOperator<Integer> func =x->x*7;
		int n1= func.apply(10);
		
		System.out.println(n1);
		
	List<String> langlist= new ArrayList<String>();
	langlist.add("java");
	langlist.add("php");
	langlist.add("python");
	
	System.out.println(langlist);
	langlist.replaceAll(ele ->ele + "jena");
	System.out.println(langlist.get(1));

	}

}
