package Final_Interview;

public class PrimeNumber1 {
	
	public static void number(int n)
	{
		int i,flag=0;
		int m=n/2;
		
		if(n==0 || n==1)
		{
			System.out.println(n+" "+"Given number is not prime");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" "+"Given number is not prime");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)System.out.println(n+" "+"Given number is  prime");
	}
	
	public static void main(String rtyg[])
	{
		number(12);	
	
}	
}