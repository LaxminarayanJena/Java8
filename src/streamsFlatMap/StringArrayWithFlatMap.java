package streamsFlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringArrayWithFlatMap {

	public static void main(String[] args) {
		String data[][] = new String[][] {

				{ "a", "b" }, { "c", "d" }, { "e", "f" } };

		
		  //cant apply stream in data Stream //no output
				  Stream<String[]> dataStream1=Arrays.stream(data);
				  Stream<String[]> dataStreamFilter1=dataStream1.filter(x->"a".equals(x.toString()));
				  dataStreamFilter1.forEach(System.out::println);
				
		 
		   //apply flatmap on dataStream
		  Stream<String[]> dataStream=Arrays.stream(data);
		  Stream<String> streamFlatMap=dataStream.flatMap(x->Arrays.stream(x));
		  Stream<String> dataStreamFilter=streamFlatMap.filter(x->"a".equals(x.toString()));
		 
		  dataStreamFilter.forEach(System.out::println);
		  
		

		// composite actions

		Stream<String> finalStream = Arrays.stream(data)
				.flatMap(x -> Arrays.stream(x))
				.filter(x -> "c".equals(x.toString()));
		finalStream.forEach(System.out::println);

	}

}
