package CollectonsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class SortStrings {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Ram","Rahim","Antony"));
		
		Collections.sort(names);
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);

	}

}
