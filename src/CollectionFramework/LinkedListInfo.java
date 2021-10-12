package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedListInfo {

	public static void main(String[] args) {
		
		
		LinkedHashMap<String, Integer> EmpDetails = new LinkedHashMap<String,Integer>();
		
		EmpDetails.put("Naveen", 100);
		EmpDetails.put("John", 56784);
		EmpDetails.put("Ramu", 678);
		
		
		EmpDetails.forEach((K,V)->System.out.println(K+""+V));
		
System.out.println("-----------------------");		
		
		HashMap<String, Integer> EmpDetailsHashMap = new HashMap<String,Integer>();
		
		EmpDetailsHashMap.put("Naveen", 100);
		EmpDetailsHashMap.put("John", 56784);
		EmpDetailsHashMap.put("Ramu", 678);
		
		
		EmpDetailsHashMap.forEach((K,V)->System.out.println(K+""+V));
	}

}
