package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=67;
		int m=n/2;
		int flag=0;
		
		if(n==0 || n==1)
		{
			System.out.println("Given Number"+" "+n+" "+"is not a prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
				System.out.println("Given Number" +" "+n+" "+"is not a PrimeNumber");
				flag=1;
				break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Given Number" +" "+n+" "+"is  PrimeNumber");
		}
		
		
		
	}
	
}

