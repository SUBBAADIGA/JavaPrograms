package HackerEarth;

public class Sum_Of_all_devisors {

	public static void main(String[] args) {
		System.out.println(divSum(4));
		

	}

	
	public static int divSum(int num)
	{
		int result=0;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				if (i == (num / i)) 
                    result += i; 
                else
                    result += (i + num / i); 
			}
		}
		return (result+1);
	}
}
