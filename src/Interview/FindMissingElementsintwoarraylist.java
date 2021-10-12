package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingElementsintwoarraylist {

	public static void main(String[] args) {
	
		ArrayList<String> firstname=new ArrayList<String>(Arrays.asList("Ramesh","Suresh","Rakesh","Pradeep"));
		
		ArrayList<String> Lastname=(ArrayList<String>)firstname.clone();
		Lastname.add("John");
		
		Lastname.removeAll(firstname);
		System.out.println(Lastname);
		
		//Find out common elements in two arraylist
		
		ArrayList<String> list1 = (ArrayList<String>)firstname.clone();
		ArrayList<String> list2 = (ArrayList<String>)Lastname.clone();
		
		boolean g = list1.retainAll(list2);
		
		

	}

}
