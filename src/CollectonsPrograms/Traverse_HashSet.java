package CollectonsPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class Traverse_HashSet {

	public static void main(String[] args) {

		
		HashSet<String> names=new HashSet<String>();
		names.add("Tom");
		names.add("Sandy");
		names.add("Mani");
		names.add("maxi");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
