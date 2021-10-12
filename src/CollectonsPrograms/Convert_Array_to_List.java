package CollectonsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Array_to_List {

	public static void main(String[] args) {

		
		Integer[] values = { 1, 3, 7 };
		
		
		List<Integer> list = Arrays.asList(values);
		System.out.println(list);
	}

}
