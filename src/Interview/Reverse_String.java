package Interview;

public class Reverse_String {
		
	public static void main(String[] args)
	{
		String act="RamNaresh";
		
		char[] ch=act.toCharArray();
		
		String rev="";
		for(int i=(act.length()-1);i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		System.out.println(rev);
	}

}
