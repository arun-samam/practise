package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"arun", "varun","karun","marun","arun","varun","arun"};
		
			Stream.of(names)
					.collect(Collectors.groupingBy(e->e , Collectors.counting() ))
					.forEach((k,v)->System.out.println(k +"  ::  "+v));
	}

}
