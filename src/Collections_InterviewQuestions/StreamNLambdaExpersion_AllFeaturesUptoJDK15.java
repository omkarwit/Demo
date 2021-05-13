package Collections_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamNLambdaExpersion_AllFeaturesUptoJDK15 {

	public static void main(String[] args) {
		// Find out even number using stream
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.filter(e->e%2 ==0)
		//.forEach(e->System.out.println(e)); OR below line
		.forEach(System.out::println);
		
		// Appending World to the words.
		Stream.of("hello","Java")
		.map(e -> e + " World")
		.forEach(System.out::println);
		
		//Optional class : Used to deal with NullPointerException in Java application.
		//A container object which may or may not contain a non-null value.
		
		String s[]=new String[5];
		//s[2]="Omkar";
		Optional<String> isNull=Optional.ofNullable(s[2]);
		
		//isPresent() Method Or ifPresent() Method
		if(isNull.isPresent()) {
			
		}else {
			System.out.println("Value is not available");
		}
		
		//ifPresent() method
		isNull.ifPresent(System.out::println);
		
		// JDK - 9 Features :
		// Factory methods for immutable collection
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Instead of writing above you can write below 2 lines commented as its not support in to current machine version JDK -8. Its available above JDK 9 version
//		List<String> lang=List.of("java","python","javascript");
//		lang.stream().forEach(System.out::println);
		
	}

}
