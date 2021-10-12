package StringFunctions;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="Testing";
		
		StringBuffer bf=new StringBuffer(str);
		
		StringBuffer reverse = bf.reverse();
		System.out.println(reverse.toString());
		
		StringBuilder sb=new StringBuilder(str);
		
		System.out.println(sb.reverse().toString());
	}

}
