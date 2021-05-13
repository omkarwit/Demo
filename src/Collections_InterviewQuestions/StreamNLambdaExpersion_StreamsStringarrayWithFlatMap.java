package Collections_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamNLambdaExpersion_StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data[][]=new String[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"}
		};
		
		Stream<String[]> dataStream=Arrays.stream(data);

// 	if below code executed then we get blank output. 
//		Stream<String[]> dataStreamFilter=dataStream.filter(x->"a".equals(x.toString()));
//		dataStreamFilter.forEach(System.out::println);

		
		Stream<String> streamFlatMap=dataStream.flatMap(x->Arrays.stream(x));
		Stream<String> dataStreamFilter=streamFlatMap.filter(x->"a".equals(x.toString()));
		dataStreamFilter.forEach(System.out::println);
		
	}

}
