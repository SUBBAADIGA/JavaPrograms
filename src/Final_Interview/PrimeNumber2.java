package Final_Interview;

public class PrimeNumber2 {

	    public static void number(int n)
	    {
	        
	        for(int x=n;x>=2;x--)
	        {
	        	 int flag=0;
	 	        int i=0;
	 	        int m=n/2;
	        
	        if(n==0||n==1)
	        {
	            //System.out.println(n+">>"+"Given number is not a prime number");
	        }
	        else
	        {
	            for(i=2;i<=m;i++)
	            {
	                if(n%i==0)
	                {
	                    // System.out.println(n+">>"+"Given number is not a prime number");
	                     flag=1;
	                     break;
	                }
	            }
	        }
	        
	        if(flag==0) System.out.println(n+">>"+"Given number is  a prime number");
	        n--;
	    }
	    }
	    
	    public static void main(String args[]) {
	     number(100);
	    }
	}