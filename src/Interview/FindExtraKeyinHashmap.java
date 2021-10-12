package Interview;

import java.util.HashMap;
import java.util.HashSet;

public class FindExtraKeyinHashmap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		map1.put(1, "Jammu");
		map1.put(2, "Kashmir");
		map1.put(3, "Shimla");
		map1.put(4, "delhi");
		
		HashMap<Integer, String> map2=new HashMap<Integer,String>();
		map2.put(1, "Jammu");
		map1.put(2, "Kashmir");
		map1.put(3, "Shimla");
		
		
		HashSet<Integer> sortedset=new HashSet<Integer>(map1.keySet());
		sortedset.addAll(map2.keySet());
		System.out.println(sortedset);
		
		sortedset.removeAll(map2.keySet());
		System.out.println(sortedset);
		

	}

}
