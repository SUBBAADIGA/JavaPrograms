package java_sessions_Assignements;

import java.util.ArrayList;

public class ObjectAndArraylist {
	
	
	String name;
	int id;
	String Devicelist[];
	ArrayList<String> Orderhistory;

	public static void main(String[] args) {
		
		ObjectAndArraylist obj = new ObjectAndArraylist();
		obj.name="Subrahmanya";
		obj.id=230;
		obj.Devicelist=new String[3];
		obj.Devicelist[0]="Apple";
		obj.Devicelist[1]="Samsung";
		obj.Devicelist[2]="OnePlus";
		
		obj.Orderhistory=new ArrayList<String>();
		obj.Orderhistory.add("Puma T Shirt");
		obj.Orderhistory.add("Nike Shoes");
		obj.Orderhistory.add("Cooker");
		
		System.out.println(obj.Orderhistory);
		
		System.out.println("---------------");
		
		for(int i=0;i<obj.Devicelist.length;i++)
		{
			System.out.println(obj.Devicelist[i]);
		}
		
		
		System.out.println("---------------");
		
		for(String e:obj.Orderhistory)
		{
			System.out.println(e);
		}
		
		System.out.println("---------------");
		
		for(String e:obj.Devicelist)
		{
			System.out.println(e);
		}
	}

}
