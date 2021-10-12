package Final_Interview;

import java.util.Collections;

public class RevreseStringByBuffer {

	public static void main(String[] args) {
	
		
		String str="HelloWorld";
		
		StringBuffer bf=new StringBuffer(str);
		
		StringBuffer reverse = bf.reverse();
		
		System.out.println(reverse.toString());
		


	}

}
