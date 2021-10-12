package StringFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit"));
		
	Collections.sort(names);
	
	System.out.println(names);
	
	//Using Streams
	ArrayList<String> Employee=new ArrayList<String>(Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit"));
	
	List<String> data = Employee.stream().sorted().collect(Collectors.toList());
	
	System.out.println(data);
	

	}

}
