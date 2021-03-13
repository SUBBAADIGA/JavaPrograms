package java_sessions_Assignements;

import java.util.ArrayList;

public class ArraylistCheck {

	public static void main(String[] args) {


		ArrayList<String> lang=new ArrayList<String>();
//		lang.add("Kannada");
//		lang.add("English");
//		lang.add("Hindi");
//		lang.add(3, "Telugu");
//		lang.add(4, "Telugu");
//		lang.add(5, "Telugu");
//		lang.add(5,"malayalam");
		
		lang.add(0,"Hello");
		lang.add(0,"jello");
		
		for(int i=0;i<lang.size();i++)
		System.out.println(i+" "+lang.get(i));
		

	}

}
