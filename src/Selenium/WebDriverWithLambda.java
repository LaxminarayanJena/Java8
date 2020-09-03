import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWithLambda {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		/*
		 * for(WebElement element:linksList) { System.out.println(element.getText()); }
		 */
//1. print all urls
		//linksList.forEach(ele -> System.out.println(ele.getText()));
	
//2.removes all space 
		List<String> collectlist = linksList.stream()
				.filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText())
				.collect(Collectors.toList());

		collectlist.forEach(ele -> System.out.println(ele)); //removes all space 
		
		
//3.first text
		
		String firstText= linksList.stream()
				.filter(ele -> !ele.getText().equals(""))
				.findFirst().get().getText();
		System.out.println(firstText);
	
//4.findany
		String findAny= linksList.stream()
				.filter(ele -> !ele.getText().equals(""))
				.findAny().get().getText();
		System.out.println(findAny);
		
		System.out.println("--------");
	//5.exclude blank texts and which contains starts with amazon
		List<String> collectlist1=linksList.stream()
		.filter(ele->!ele.getText().equals("")&& ele.getText().contains("Amazon"))
		.map(ele->ele.getText())
		.collect(Collectors.toList());	
		collectlist1.forEach(ele -> System.out.println(ele));
		
	//6	
		List<String> AllLinkTextList=linksList.stream()
		.filter(ele->!ele.getText().isEmpty())
		.filter(ele->!ele.getText()	.startsWith(" "))	
		.map(ele->ele.getText())
		.collect(Collectors.toList());	
		AllLinkTextList.forEach(ele -> System.out.println(ele));
		
		
		driver.quit();

	}

}
