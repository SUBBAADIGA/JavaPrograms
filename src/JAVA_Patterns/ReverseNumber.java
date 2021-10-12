package JAVA_Patterns;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int num=123;
		
		int revnum=0;
		int remainder=0;
		
		while(num!=0)
		{
			remainder=num%10;
			revnum=(revnum*10)+remainder;
			num=num/10;
		}
		System.out.println(revnum);

	}

}
