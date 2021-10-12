package Final_Interview;

import java.util.Arrays;

public class FindMaxandMinNumber {

	public static void main(String[] args) {

		int num[]= {80,12,14,16,88,20,45,28};
		
		Arrays.sort(num);
		
		System.out.println(num[0]);
		System.out.println(num[num.length-1]);
	}
}
