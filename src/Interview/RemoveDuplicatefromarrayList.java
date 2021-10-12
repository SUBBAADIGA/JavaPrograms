package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatefromarrayList {

	public static void main(String[] args) {

		ArrayList<String> students=new ArrayList<String>(Arrays.asList("john","peter","JOHN","smith","john","robert","lisa","smith"));
		
		//Using LinkedHashset
		
		LinkedHashSet<String> sortstudent=new LinkedHashSet<String>(students);
		
		ArrayList<String> sortedlist = new ArrayList<String>(sortstudent);
		
		for(String e:sortedlist)
		{
			System.out.println(e);
		}
		
		System.out.println("************");
		//Using Streams
		
		ArrayList<String> clonelist = (ArrayList<String>)students.clone();
		
		List<String> sortedclone = clonelist.stream().distinct().collect(Collectors.toList());
		
		for(String e:sortedclone)
		{
			System.out.println(e);
		}

	}

}
