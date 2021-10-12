package JavaProgramingForInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class Sumofarray {

	public static void main(String[] args) {

		
		int[] arr = new int[4];
		
		arr[0]=10;
		arr[1]=12;
		arr[2]=34;
		arr[3]=45;
		int sum=0;
		
		for(int e:arr)
		{
			 sum=sum+e;
		}
		System.out.println(sum);
		
		
		ArrayList<Integer> val = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		int total=0;
		
		for(Integer e:val)
		{
			total+=e;
		}
		System.out.println(total);
	}
	

}
