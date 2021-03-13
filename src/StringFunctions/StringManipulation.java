package StringFunctions;

public class StringManipulation {

	public static void main(String[] args) {
	
		String str="Hello This is my first java program im so happy";
		
		System.out.println(str.length());  //47
		
		System.out.println(str.charAt(36));
		
		System.out.println(str.charAt(5));  //blank
		
	//	System.out.println(str.charAt(68));//StringIndexoutofound Exception
		
		System.out.println(str.indexOf('f'));//first occurence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//second occurence of i
		
		System.out.println(str.indexOf('i',(str.indexOf('i', str.indexOf('i')+1))+1));//third occurence
		
		System.out.println(str.indexOf('i', (str.indexOf('i',(str.indexOf('i', str.indexOf('i')+1))+1))+1));//fourth occurence
		
		System.out.println(str.indexOf("first"));
		
		System.out.println(str.indexOf("python"));//it will return -1 when string doesnt match
	}

}
