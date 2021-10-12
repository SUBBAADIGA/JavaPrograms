package JavaProgramingForInterview;

public class sumoftwoarray {

	public static void main(String[] args) {
    
		
		int[] arr1 = new int[]{1,2,3};
		
		int[] arr2=new int[] {4,5,6};
		
		int[] sumarr = new int[3];
		
		for(int i=0;i<arr1.length;i++)
		{
			 
			sumarr[i]=arr1[i]+arr2[i];
		}
		
		for(int i=0;i<sumarr.length;i++)
		{
			System.out.println(sumarr[i]+" ");
		}
		
		
		
	}

}
