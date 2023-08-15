package java9features;

import java.util.Arrays;
import java.util.List;

public class Of{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> of = List.of("arun","kiran","vennela","kishore");
9849348444		
		//of :: is a immutable List collection . you CAN'T update, add, remove, clear any element
		//                                       size also fixed
		//Advantages:  Thread-safe as it is Immutable
		//			   Efficient use of memory as no space is preserved for future elements
		//			   Ensures Integrity as it is immutable
		
		System.out.println(of.size());
		
		try {
			of.add("vinod");
		}catch(UnsupportedOperationException uoe) {
			System.out.println("adding element NOT supported");
		}
		
		try {
			of.set(0, "varun");
		}catch(UnsupportedOperationException uoe) {
			System.out.println("updating element NOT supported");
		}
		
		try {
			of.remove(0);
		}catch(UnsupportedOperationException uoe) {
			System.out.println("removing element NOT supported");
		}
		
		try {
			of.clear();
		}catch(UnsupportedOperationException uoe) {
			System.out.println("clearing list NOT supported");
		}
		
		of = null;
		
		String[] emps = {"arun","kiran","vishal","vinod"};
		List<String> asList = Arrays.asList();
		
		// asList:: is fixed-sized List
		// CAN modify/update elements ; CAN'T add,remove,clear the list
		//NOT immutable
		
		asList.set(0, "vinod");
		
		of.forEach(System.out::println);
		System.out.println();
		asList.forEach(System.out::println);
	}

}
