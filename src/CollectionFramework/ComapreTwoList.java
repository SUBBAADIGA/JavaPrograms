package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComapreTwoList {

	public static void main(String[] args) {
		// Compare two list and find out additional element.
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","C","B","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		l1.removeAll(l2);
		
		System.out.println(l1);//F
	}

}
