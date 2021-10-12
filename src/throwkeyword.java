
public class throwkeyword {
	
	public void Eligibility(int age) throws Exception 
	{
		if(age>=18)
		{
			System.out.println("User is Eligible");
		}
		else
		{
			throw new Exception("User is not eligible as age is less than 18");
		}
	}
	public static void main(String[] args) throws Exception {
		
	throwkeyword th=new throwkeyword();
			th.Eligibility(17);
		
	}
	

}
