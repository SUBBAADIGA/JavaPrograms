package CollectionFramework;

import java.util.HashMap;

public class CompareHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		
		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		
		
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		
	//Compare on the basis of key-value:use equals method.
		
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3));//false >> If in map3 "C" was present in last position it will give as true.
		
	//Compare on the basis of same keys:Keyset()
		
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map1.keySet().equals(map3.keySet()));//true  because keys are same only it is extra
		
		
		//Compare on the basis of same entry:Entryset()	
		
		System.out.println(map1.entrySet().equals(map2.entrySet()));//true
		System.out.println(map1.entrySet().equals(map3.entrySet()));//false
		
		
	}

}
