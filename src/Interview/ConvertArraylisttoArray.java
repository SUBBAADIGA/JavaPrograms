package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylisttoArray {

	public static void main(String[] args) {
		
		//Converting arraylist to array
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Ramesh","Suresh","John"));
		
		String[] con = names.toArray(new String[names.size()]);
		
		for(String e:con)
		{
			System.out.println(e);
		}
		
		
		//Converting array to arraylist
		
		String country[]=new String[4];
		country[0]="India";
		country[1]="US";
		country[2]="Italy";
		country[3]="China";
		
		System.out.println(country[2]);
		
		ArrayList<String> countryList = new ArrayList<String>(Arrays.asList(country));
		System.out.println(countryList);
	}

}
