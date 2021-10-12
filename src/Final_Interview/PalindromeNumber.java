package Final_Interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number=123;
		final int actualnumber=number;
		
		int reverse=0,remainder=0;
		while(number!=0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		if(reverse==actualnumber)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		

	}

}
