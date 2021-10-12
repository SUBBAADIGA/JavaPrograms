package CollectionFramework;

import java.util.TreeMap;

public class TreemapConcept {

	public static void main(String[] args) {

		
		
		TreeMap<Integer, String> sal=new TreeMap<Integer, String>();
		
		sal.put(1000, "ram");
		sal.put(2000, "bheem");
		sal.put(3000, "som");
		sal.put(11234, "krish");
		sal.put(345, "bal");
		
		System.out.println(sal);  //{345=bal, 1000=ram, 2000=bheem, 3000=som, 11234=krish}
		
		System.out.println(sal.lastKey());
	}

}
