package Collections_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNLambdaExpersion_StreamsFilterCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> productList=Arrays.asList("Laptop","Pen","Bag","Mouse");
		System.out.println(productList);
		// Iterate over list
		productList.forEach(product->{
			System.out.println(product);
		});
		
		// Filter collection and again collect as collection in stream.
		List<String> filter_collection=productList.stream()
		.filter(product->!product.equals("Pen"))
		.collect(Collectors.toList());
		
		/* You can also use after filter => findAny() and orElse() method if u are using these methods then don't use collect method
		 * 		
		 * .findAny()        // If it finds then return
		   .orElse(null);    // Else return null.
		 */
		
		//Iterate over filtered collection
		filter_collection.forEach(filter_product->{
			System.out.println(filter_product);
		});
	}

	
	
}
