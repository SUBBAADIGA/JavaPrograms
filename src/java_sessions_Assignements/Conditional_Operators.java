package java_sessions_Assignements;

public class Conditional_Operators {

	public static void main(String[] args) {
		//1. Take three numbers from the user and print the greatest number. 
		
		double x=25.1, y=355.78, z=345.78, t=900.0;
		
		if(x>y && x>z && x>t)
		{
			System.out.println(x+" x is the greatest value in four numbers");
		}
		else if(y>z && y>t)
		{
			System.out.println(y+" y is the greates value in four numbers");
		}
		else if(z>t)
		{
			System.out.println(z+"z is the greates value in four numbers");
		}
		else
		{
			System.out.println(t+"t is the greates value in four numbers");
		}
		
	}

}
