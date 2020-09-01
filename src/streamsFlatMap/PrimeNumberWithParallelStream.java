package streamsFlatMap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
		System.out.println(isPrime(2));
		long t1,t2;
		t1=System.currentTimeMillis();
		
		
		long count= Stream.iterate(0, n ->n+1)
		.limit(500000)
		.parallel()//less time than sequential .parallel-8 sequential-22
		.filter(PrimeNumberWithParallelStream::isPrime)
		.peek(x->System.out.println(x))
		.count();
		
		System.out.println(count);
		t2=System.currentTimeMillis();
		
		System.out.println("Total time taken " +(t2-t1)/1000);
		

	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
			
			return false;
		return !IntStream.rangeClosed(2,number/2).anyMatch(x->number%x==0);
		
	}

}
