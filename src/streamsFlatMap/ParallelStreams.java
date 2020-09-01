package streamsFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());
		
		//1. parallel() method on stream
		Stream stream =Stream.of("jena","ram","sam","hari");
		
		//BaseStream parallelStream =stream.parallel();
		
		Stream.of("jena","ram","sam","hari").forEach(System.out::println);
		
		System.out.println("--------");
		
		Stream.of("jena","ram","sam","hari").parallel().forEach(System.out::println);
		System.out.println("--------");
		
		
		//2.use parallel Stream() method on a collection stream
		Arrays.asList("jena","ram","sam","hari").parallelStream().forEach(System.out::println);
		
		//1 to 10
		System.out.println("-----normal stream---");
		IntStream.rangeClosed(1,10).forEach(System.out::println);
		System.out.println("--------parallel stream-----");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		//to print fro a-z
		System.out.println(getAlphabetsList());
		System.out.println("-----normal stream---");
		getAlphabetsList().stream().forEach(System.out::println);
		System.out.println("--------parallel stream-----");
		getAlphabetsList().parallelStream().forEach(System.out::println);
		
		
		//check stream is running in parallel mode :isParallel() method:
		IntStream range =IntStream.range(1, 10);
		System.out.println(range.isParallel()); //false
		
		IntStream range1 =IntStream.range(1, 10);
		range1.parallel();
		System.out.println(range1.isParallel()); //true
		
		
		

	}
	
	public static List<String> getAlphabetsList()
	{
		List<String> alpha = new ArrayList<String>();
		int n=97;
		while(n<=122)
		{
			char c=(char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
		
	}

}
