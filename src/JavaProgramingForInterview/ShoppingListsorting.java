package JavaProgramingForInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ShoppingListsorting {

	public static void main(String[] args) {
	

		
		List<String> Shoppinglist = Arrays.asList("jeans","purse","belt","purse","jeans");
		
		ArrayList<String> SortedList = new ArrayList<String>();
		
    TreeSet<String> data = new TreeSet<String>();
		
		for(String e:SortedList)
		{
			if(data.add(e)==false)
			{
				System.out.println(e);
			}
		}
		
	    
		
		for(int i=0;i<data.size();i++)
		{
			int counter=1;
			for(int j=i+1;j<Shoppinglist.size();j++)
			{
				if(Shoppinglist.get(i).equals(Shoppinglist.get(j)))
				{
					counter++;
					
				}		
			}
			if(counter>0) {
			SortedList.add(Shoppinglist.get(i)+" "+counter);}
			
		}
		
		System.out.println(SortedList);

	}

}
