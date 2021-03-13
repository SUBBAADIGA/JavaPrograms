package java_sessions_Assignements;

public class Print_numbers_byLoops {

	public static void main(String[] args) {

		
		//for loop
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		//while loop
		int num=10;
		while(num>1)
		{
			System.out.println(num);
			num--;
		}
		System.out.println("-------------------");
		//do while
		
		int x=10;
		do {
			System.out.println(x);
			x--;
		} while (x>=1);
	}

}
