package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenfromArraylist {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(10,11,12,13,14,15,16));
		
//		//This will print even numbers
//		number.removeIf((num->num%2!=0));
//		System.out.println(number);
		
		//This will print odd numbers
		number.removeIf(num->num%2==0);
		System.out.println(number);
		

	}

}
