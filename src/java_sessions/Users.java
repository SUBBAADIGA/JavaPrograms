package java_sessions;

import java.util.ArrayList;

public class Users {
	
	String Uname;
    String DeviceList[];
    ArrayList<Object> Orderhistory;

	public static void main(String[] args) {
		Users s1=new Users();
		
		s1.Uname="Ram";
		s1.DeviceList=new String[3];
		s1.DeviceList[0]="Laptop";
		s1.DeviceList[2]="Mobile";
		
	
		
		for(String e:s1.DeviceList)
		{
			System.out.println(e);
		}
		
		
		s1.Orderhistory=new ArrayList<Object>();
		s1.Orderhistory.add("SamSung Mobile");
		s1.Orderhistory.add(true);
		s1.Orderhistory.add('C');
		s1.Orderhistory.add(200);
		
		for(Object e2:s1.Orderhistory)
		{
			System.out.println(e2);
		}
			
		
		
		
		
		
	}

}
