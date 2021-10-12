package CollectonsPrograms;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String str="Ramesh";
		
		char[] ch = str.toCharArray();
		
		String fin="";
		
		
		System.out.println(str.length());//6

		for(int i=((str.length())-1);i>=0;i--)
		{
		   fin=fin+ch[i];
		}
		
		System.out.println(fin);
		
		
		String ste="hello";
				String lit = ste+'j';
				System.out.println(lit);

	}

}
