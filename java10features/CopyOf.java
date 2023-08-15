package java10features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class CopyOf {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		Optional<String> optional = null;
		
		names.add("arun");
		names.add("varun");
		names.add("sunil");
		names.add("siddu");
		
		Set<String> set = Set.copyOf(names);
		set.forEach(System.out::println);
 	}

}
