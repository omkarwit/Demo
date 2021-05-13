package Collections_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> namesList=Arrays.asList("Papa","Aai","Mrudul","Omkar");
		
		
		//1. With Anonymous class:
		namesList.forEach(new Consumer<String>() { //Anonymous method

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
   System.out.println("---------------------");	
		//2. Lambda function.
		
		namesList.forEach(names->{    //forEach takes always takes Consumer interface as paramter.
			System.out.println(names);
		} );
	
	System.out.println("---------------------");
		//3. Method References
		namesList.forEach(System.out:: println); //System is class, println is method
	}
}
