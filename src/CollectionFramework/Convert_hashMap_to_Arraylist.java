package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Convert_hashMap_to_Arraylist {

	public static void main(String[] args) {

		HashMap<String,Integer> CompMap=new HashMap<String,Integer>();
		
		CompMap.put("Google",10000);
		CompMap.put("AMAZON", 60000);
		CompMap.put("WALMART", 56000);
		CompMap.put("TCS", 128900);
		
		
		//Convert keys into arraylist using keyset
		
	List<String> CompName=new ArrayList<String>(CompMap.keySet());
	
	for(String comp:CompName)
	{
		System.out.println(comp);
	}
	
	//Convert Values into arraylist 
	
	List<Integer> CompValues=new ArrayList<Integer>(CompMap.values());
	
	for(Integer val:CompValues)
	{
		System.out.println(val);
	}
	
	//Using lamda functions
	
	CompMap.forEach((K,V)->System.out.println("Key"+K+"Values"+V));
	
		
	}
	

}
