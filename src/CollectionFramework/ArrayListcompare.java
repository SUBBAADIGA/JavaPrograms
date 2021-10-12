package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListcompare {

	public static void main(String[] args) {
		
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(l1);
		
		System.out.println(l1.equals(l2));
		

	}

}
