package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionInterface {

	public static void main(String[] args) {
	
		Predicate<Integer> func = x->x>5;
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,7,8,9);
		
		List<Integer> collist=list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(collist);
		
		
		//predicate with &&
		
		List<Integer> collist1=	list.stream().filter(x-> x>5 && x<9).collect(Collectors.toList());
		System.out.println(collist1);
		
		//predicate with negate();
		
		List<String> nameslist = Arrays.asList("JENA","JENUUU", "JENAS" ,"RAM","SAM");
		Predicate<String> names =x->x.startsWith("JENA");
		
		List<String> newNamesList = nameslist.stream().filter(names.negate()).collect(Collectors.toList());
		System.out.println(newNamesList);
		
		
		
		
		

	}

}
