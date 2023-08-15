package practice;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileProcessor {
    public static void main(String[] args) throws IOException {
 
    	Set<Integer> set = new HashSet();
    	
    	set.add(2);
    	set.add(3);
    	set.add(4);
    	set.add(5);
    	set.add(6);
    	set.add(7);
//    	System.out.println(set);
    	
    	int[] arr = {1,2,3,4,5,6,7,8,9};
    	
    	List asList = Arrays.asList(arr);
//    	System.out.println(asList);
    	
    	System.out.println(asList.toArray());
    	
    	
    }
}