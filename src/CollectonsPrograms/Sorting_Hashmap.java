package CollectonsPrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Sorting_Hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> Price=new HashMap<Integer, String>();
		
		Price.put(234, "Aloo");
		Price.put(100, "Gobi");
		Price.put(890, "Panner");
		Price.put(45, "Milk");
		
		System.out.println(Price);
		
		NavigableMap<Integer, String> SortedPriceDecending = new TreeMap<>(Price).descendingMap();
		System.out.println(SortedPriceDecending);
		
		TreeMap SortedPriceAscending = new TreeMap<>(Price);
		
		System.out.println(SortedPriceAscending);
	
	


		
	}

}
