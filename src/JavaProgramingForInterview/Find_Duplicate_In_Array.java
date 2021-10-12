package JavaProgramingForInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Find_Duplicate_In_Array {

	public static void main(String[] args) {

		
		String Infra[]= {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};
		
		//Brute force
		
		for(int i=0;i<Infra.length;i++)
		{
			for(int j=i+1;j<Infra.length;j++)
			{
				if(Infra[i].equals(Infra[j]))
				{
					System.out.println(Infra[i]);
				}
			}
		}
		
		//Using Set
		
		TreeSet<String> data = new TreeSet<String>();
		
		for(String e:Infra)
		{
			if(data.add(e)==false)
			{
				System.out.println(e);
			}
		}
		
		//Using Streams Set and Filter
		TreeSet<String> dataSet = new TreeSet<String>();
		Set<String> dupSet = Arrays.asList(Infra).stream().filter(e->!dataSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);

	}

}
