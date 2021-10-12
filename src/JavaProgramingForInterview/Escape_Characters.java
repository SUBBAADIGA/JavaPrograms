package JavaProgramingForInterview;

public class Escape_Characters {

	public static void main(String[] args) {

		// 1)  /"Hello"/
		// 2)  /'Hello'/\
		
		// 3) "I Love "JAVA" and "Programing".
		
		System.out.println("/\"Hello\"/");  //   put \ before the double quoute.
		
		System.out.println("/'Hello'/\\");
		
		System.out.println("I Love \"JAVA\" and \"Programing\".");
		
		getXpath("test");
		
	}
	
	public static void getXpath(String name)
	{
		
		String Xpath="//input[@id='"+name+"']";
		System.out.println(Xpath);
				
		//String Xpath="//input[@id='test']"
	}

}
