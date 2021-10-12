package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<String, String> Capital = new HashMap<String,String>();
		
		Capital.put("INDIA", "DELHI");
		Capital.put("ENGLAND", "UK");
		Capital.put("US", "WASHINGTON DC");
		Capital.put(null, "BTM");
		Capital.put("China", null);
		Capital.put("Russia", null);
		
		
		//Normal get the hashmap values
		
		System.out.println(Capital.get("ENGLAND"));
		
		//To fetch the values from Hashmap from Iterator concept: Over KeySet()
		
		Iterator<String> it = Capital.keySet().iterator();
		
		while(it.hasNext())
		{
			String Key=it.next();
			System.out.println("Key is "+ " "+Key+" "+"And Value is "+Capital.get(Key));
		}
		
		System.out.println("----------***********--------------");
		
		
		//To fetch the values from Hashmap from Iterator concept: Over set(pair): using entryset
		
		
		Iterator<Entry<String, String>> it2 = Capital.entrySet().iterator();
		
		while(it2.hasNext())
		{
			Entry<String, String> entry = it2.next();
			System.out.println("Key is "+" "+entry.getKey()+" "+"and value is "+" "+entry.getValue());	
		}
		
		
		System.out.println("----------***********--------------");
		//Using Java 8 for each and lamda.
		
		Capital.forEach((k,v)->System.out.println("Key is "+" "+k+" "+"and value is"+" "+v ));

	}

}
