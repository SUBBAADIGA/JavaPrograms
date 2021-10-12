package JavaPracticeProgram;

public class trowkeyword {
	
	public static void Eligibility(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("User is not eligible for voting as age is less 18");
		}
		else
		{
			System.out.println("age is valid");
		}
	}

	public static void main(String[] args) {

		Eligibility(15);
		
	}

}
