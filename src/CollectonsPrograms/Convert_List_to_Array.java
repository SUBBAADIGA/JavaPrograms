package CollectonsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_List_to_Array {

	public static void main(String[] args) {

		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Tom","Rahul","Deepak"));
		
		names.add(3,"ght");
		
		System.out.println(names);
		
		Object[] arr=names.toArray();
		
		for(Object element:arr)
		{
			System.out.println(element);
		}
 	}

}
