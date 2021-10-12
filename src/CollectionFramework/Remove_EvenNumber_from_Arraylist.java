package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

//Program to remove even numbers from arraylist.

public class Remove_EvenNumber_from_Arraylist {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(20,16,13,7,5,9,17,24,25,25));
		
		numbers.removeIf(num->num%2==0);
		System.out.println(numbers);
		
	}

}
