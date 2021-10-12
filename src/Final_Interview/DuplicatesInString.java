package Final_Interview;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicatesInString {

	public static void main(String[] args) {
		Duplicate("HelLoWorld");

	}
	
	public static void Duplicate(String str)
	{
		String Actual = str.toLowerCase();
		char[] letters = Actual.toCharArray();
		
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(char e:letters)
		{
			if(charMap.containsKey(e))
				{
				charMap.put(e, charMap.get(e)+1);
				}
			else
			{
				charMap.put(e, 1);
			}
		}
		
		//This is using entryset
//		Set<Entry<Character, Integer>> findduplicate = charMap.entrySet();
//		
//		for(Entry<Character, Integer> es:findduplicate)
//		{
//			if(es.getValue()>1)
//			{
//				System.out.println(es.getKey()+" "+es.getValue());
//			}
//		}
		
		//This is using Keyset
	Iterator<Character> it = charMap.keySet().iterator();
	while(it.hasNext())
	{
		Character key = it.next();
		if(charMap.get(key)>1)
		{
			System.out.println(key+" "+charMap.get(key));
		}
	}
		
		
	}

}
