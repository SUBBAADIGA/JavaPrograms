package JAVA_Patterns;

import java.util.ArrayList;
import java.util.Collections;

public class Highestin2dimensionalarray {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,2,3},{3,5,8},{34,56,89}};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{	System.out.println(arr[i].length);
				list.add(arr[i][j]);
			}
		}
		
		System.out.println(Collections.max(list));
	
		

	}

}
