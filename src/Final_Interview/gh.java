package Final_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class gh {
	  public static void main(String args[]) {
	        
			String BlueChips[]= {"Amazon","Flipkart","Amazon","DevisLabs","AsianPaints"," ","DevisLabs"," "};
			
			TreeSet<String> find=new TreeSet<String>();

ArrayList<String> arr=new ArrayList<String>();

arr.add("ff");

arr.add("ff");

arr.add("ff");
arr.add("ff");

System.out.println(arr.size());




TreeSet<String> val = new TreeSet<String>();
			
		for(int i=BlueChips.length-1;i>=0;i--)
		{
			if(!find.add(BlueChips[i]))
			{
				System.out.println(BlueChips[i]);
			}
		}
			

		}

	}
