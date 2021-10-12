package JavaProgramingForInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_In_String {

	public static void main(String[] args) {
		
		Duplicate("sumantas");

	}
	
	
	
	public static void Duplicate(String str) {
		
		char[] letters = str.toCharArray();
		
		HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
		
		
		for(Character ch:letters)  //java
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		//priting the Map
		
		Set<Entry<Character, Integer>> entry = charMap.entrySet();
		
		for(Entry<Character, Integer> e:entry)
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
			
		}
		
		
	 }
	 
} 
	 
	 

