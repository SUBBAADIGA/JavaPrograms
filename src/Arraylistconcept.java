import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistconcept {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.remove(7);
//		System.out.println(numbers);   //[1, 2, 3, 4, 5, 6, 7, 9, 10]
		
//		numbers.removeIf(num->num%2==0);
//		System.out.println(numbers);   //[1, 3, 5, 7, 9]
		
		
		numbers.removeIf(num->num%2!=0);
		System.out.println(numbers);    //[2, 4, 6, 8, 10]

		
		//Converting arraylist to array
		
		ArrayList<Integer> data=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Object[] newdata = data.toArray();
		
		for(Object e:newdata)
		{
			System.out.println(e);
		}
		
		ArrayList<Integer> data2=new ArrayList<Integer>(Arrays.asList(10,2,3,4,5,6,7,8,9,1));
		
		System.out.println(data2.equals(data));
		
		Collections.sort(data);
		System.out.println(data);
		Collections.reverse(data);
		System.out.println(data);
	}

}
