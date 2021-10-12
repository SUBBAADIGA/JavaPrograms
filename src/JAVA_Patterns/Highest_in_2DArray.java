package JAVA_Patterns;

import java.util.ArrayList;
import java.util.Collections;

public class Highest_in_2DArray {

	public static void main(String[] args) {
		
		

//		   2 4 5
//		   6 4 8
//		   5 3 1
		
		int val[][]= {{2,4,5},{6,4,8},{5,3,1}};
	
		ArrayList list = new ArrayList<>();
		
		for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<val.length;j++)
			list.add(val[i][j]);
		}
		
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		
	
		   

	}

}
