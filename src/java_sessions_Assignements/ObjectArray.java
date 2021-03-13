package java_sessions_Assignements;

import java.util.ArrayList;

public class ObjectArray {

	public static void main(String[] args) {
	
		
		//--Try to create multiple Object Arrays for different players 

		
	ArrayList<Object> PlayerDetails=new ArrayList<Object>();
	
	
	PlayerDetails.add("Sachin");
	PlayerDetails.add("Right Handed Batsman");
	PlayerDetails.add('A');
	PlayerDetails.add(45);
	PlayerDetails.add("Mumbai");
	for(Object e:PlayerDetails)
	{
      System.out.println(e);
	}
	
	//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
	
	
	System.out.println("--------------");
	ArrayList<String> colors=new ArrayList<String>();
	
	colors.add("Red");
	colors.add("Green");
	colors.add("Blue");
	colors.add("White");
	colors.add("Red");
	
	for(int i=0;i<colors.size();i++)
	{
		System.out.println(colors.get(i));
	}
	
	
	
	}

}
