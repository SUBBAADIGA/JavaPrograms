package java_sessions;

public class MethodsWithInputAndReturn {
	
	
	public int add(int x,int y)
	{
		System.out.println("Printing total sum");
		int sum=x+y;
		return sum;
	}

	public static void main(String[] args)
	{
		 MethodsWithInputAndReturn obj=new MethodsWithInputAndReturn();
		 int total=obj.add(100, 200);
		 System.out.println(total);

	}

}
