package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodReference {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Tom", "Samm", "poltu");

		// 1.Anonymous class
		namesList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}

		});

		// 2.Lambda expression

		namesList.forEach(str -> System.out.print(str + ","));

		// 3.Method References
		namesList.forEach(System.out::println);
	}

}
