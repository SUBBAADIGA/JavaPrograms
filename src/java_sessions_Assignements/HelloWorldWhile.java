package java_sessions_Assignements;

public class HelloWorldWhile {

	public static void main(String[] args) {
	
		//Write a program in Java to print "Hello World" ten times using while loop
		int x=1;
		while(x<=10)
		{
			System.out.println("Hello World");
			x++;
		}
		
		//Write a program in Java to print 1 to 10 using 
		//while loop but quit if multiple of 7 is encountered

		
		int y=1;
		while(y<=10)
		{
			if(y%7!=0)
			{
				System.out.println(y);
			}
			y++;
		}
		
	}

}
