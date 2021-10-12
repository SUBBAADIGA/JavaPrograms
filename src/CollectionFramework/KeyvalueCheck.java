package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KeyvalueCheck {

	public static void main(String[] args) {
		HashMap<String, String> Capital = new HashMap<String,String>();
		
		Capital.put("Haryana", "Delhi");
		Capital.put("Punjab", "Amritsar");
		Capital.put("Maharastra", "Mumbai");
		Capital.put("Naveen", "GL");
		Capital.put("Peter", "AP");
		Capital.put("Mani", "ui");
		
		
	//	Capital.remove("Punjab");
		
		System.out.println(Capital.size());
		
		
		LinkedHashMap<Integer, String> EMP = new LinkedHashMap<Integer,String>();
		
		EMP.put(234, "ram");
		EMP.put(100, "reena");
		EMP.put(456, "ytu");
		EMP.put(145, "kgj");
		
		
		EMP.forEach((K,V)->System.out.println(K+" "+V));
	}

}
