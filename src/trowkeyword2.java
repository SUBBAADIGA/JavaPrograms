
public class trowkeyword2 {
	
	
	public static  void VoterEligibility(int age) throws Exception
	{
		if(age>=18)
		{
			System.out.println("Candidate is eligible for voting");
		}
		else
		{
			throw new Exception("Candidate is not Eligible for Voting");
		}
	}

	public static void main(String[] args)  {
		try {
		VoterEligibility(10);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		//	e.printStackTrace();
		}

	}

}
