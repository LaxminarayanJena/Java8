package lambda;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		WebPage w1= (name) ->{
			System.out.println("hi " +name);
		};
		

		WebPage w2= (name) -> System.out.println("hi " +name);
		WebPage2 w3= (name,age) -> System.out.println("hi " +name + "-" + age);
		
		/*
		WebPage w1= new WebPage()
				{

					@Override
					public void header(String value) {
						System.out.println("hi + value");
						
					}
			
				};
				
				*/
				
				w1.header("google");
				w2.header("samsung");
				w3.header("ram",13);
				

	}

}
