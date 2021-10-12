package Final_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortanArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> data = new ArrayList<String>(Arrays.asList("zasd","hjf","uyui","abdc","dfch"));
		
		
Collections.reverse(data); //This will just reverse the order in which data is stored in arraylist.
//	
//Collections.sort(data,Collections.reverseOrder());


	
	System.out.println(data);

	}

}
