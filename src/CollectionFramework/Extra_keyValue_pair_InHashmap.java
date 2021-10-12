package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Extra_keyValue_pair_InHashmap {

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
		
		
		 Set<Entry<Integer, String>> cList = map1.entrySet();
    	 cList.addAll(map4.entrySet());
	     cList.removeAll(map1.entrySet());
	     
	     System.out.println(cList);
	     
	
		 

	}

}
