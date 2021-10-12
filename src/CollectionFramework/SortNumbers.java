package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumbers {

	public static void main(String[] args) {

		
		List<Integer> marks=new ArrayList<Integer>(Arrays.asList(25,67,89,45,36,78));
		
		Collections.sort(marks);
		
		System.out.println(marks);
	}

}
