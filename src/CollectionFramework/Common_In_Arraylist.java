package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_In_Arraylist {

	public static void main(String[] args) {
	
		
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("JAVA","PYTHON","C#","RUBY"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("JAVA","PYTHON","C#","RUBY","JS"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);//[JAVA, PYTHON, C#, RUBY]
		
		

		

	}

}
