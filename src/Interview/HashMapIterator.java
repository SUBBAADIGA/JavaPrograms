package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapIterator {

	public static void main(String[] args) {
	
		HashMap<String, String>  capitalMap=new HashMap<String,String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("England", "UK");
		capitalMap.put("US", "Washington");
		capitalMap.put("China",null);
		capitalMap.put(null, "BTM");
		capitalMap.put(null, "JP");
		System.out.println(capitalMap.size());
		System.out.println(capitalMap.get(null));
		
		Iterator<String> it=capitalMap.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(capitalMap.get(key));
		}
		
		//Using entry set
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext())
		{
			  Entry<String, String> entry = it1.next();
			  System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		

	}

}
