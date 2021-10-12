package Final_Interview;

import java.util.TreeSet;

public class Duplicate_In_an_Array {

	public static void main(String[] args) {
		
		String BlueChips[]= {"Amazon","Flipkart","Amazon","DevisLabs","AsianPaints"," ","DevisLabs"," "};
		
		TreeSet<String> find=new TreeSet<String>();
		
		
		for(String e:BlueChips)
		{
			//if(find.add(e)==false)
				if(!(find.add(e)))
		      	{
				   System.out.println(e);
		    	}
		}
		

	}

}
