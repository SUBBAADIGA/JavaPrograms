package java_sessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		System.out.println(arr.size());
		arr.add(100);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		arr.add(600);
		arr.add(700);
		arr.add(800);
		arr.add(900);
		arr.add(5300);
		arr.add(567);
		arr.add(345);
		arr.add(565);
		System.out.println(arr.size());
		
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rajesh");
		names.add(null);
		System.out.println(names);
		
		System.out.println(names.size());
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names);
		}
		
		
		
		

	}

}
