package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamFilterCollect {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MacBook", "shoes", "Phone");

		System.out.println(productList);
		//productList.forEach(ele -> System.out.println(ele));

		List<String> result = productList.stream().filter(ele -> !ele.equals("shoes")).collect(Collectors.toList());
		
		result.forEach(ele->System.out.println(ele));

		result.forEach(System.out::println);
	}

}
