package JavaProgramingForInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatecharcterscount {

	public static void main(String[] args) {
		
		Input("Ahftusj;ksdrtusda");

	}
	
	public static void Input(String name)
	{
		char[] words = name.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> duplicate = new HashMap<Character,Integer>();
		
		for(char e:words)
		{
			if(duplicate.containsKey(e))
			{
				duplicate.put(e, duplicate.get(e)+1);
			}
			else
			{
				duplicate.put(e, 1);
			}
		}
		
		//Printing
		
              Iterator<Character> listvalues = duplicate.keySet().iterator();
              while(listvalues.hasNext())
              {
            	  Character key = listvalues.next();
            	  if(duplicate.get(key)>1)
            	  {
            		  System.out.println(key+" "+duplicate.get(key));
            	  }
              }
	}

}
