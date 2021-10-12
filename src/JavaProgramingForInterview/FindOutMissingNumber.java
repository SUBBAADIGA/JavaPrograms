package JavaProgramingForInterview;

public class FindOutMissingNumber {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,7};
		
		int n=missingNumber(num, 7);
		System.out.println(n);

	}
	
	
	public static int missingNumber(int num[],int total)
	{
		int expectedsum=total* ((total+1)/2);
		
		int ActualSum=0;
		
		for(int s:num)
		{
			ActualSum+=s;
		}
		
		return expectedsum-ActualSum;
		
		
	}

}
