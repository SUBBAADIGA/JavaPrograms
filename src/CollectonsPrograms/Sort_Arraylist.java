package CollectonsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Arraylist {

	public static void main(String[] args) {

		
		ArrayList names = new ArrayList<Integer>(Arrays.asList(123,23,45,21,46,768));
		
		System.out.println("Before Sorting"+names);
		Collections.sort(names);  //Sorting in Ascending order
		System.out.println("After Sorting"+names);
		
		Collections.reverse(names);
		System.out.println("Decending Sorting"+names);
	}

}
