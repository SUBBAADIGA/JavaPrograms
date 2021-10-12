package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;

public class Extra_Key_InHashmap {

	public static void main(String[] args) {
	
		
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map4=new HashMap<Integer, String>();
		

		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		
		
		HashSet<Integer> combinedList=new HashSet<Integer>(map1.keySet());
		combinedList.addAll(map4.keySet());
		combinedList.removeAll(map1.keySet());
		System.out.println(combinedList);
		
		
	}

}
