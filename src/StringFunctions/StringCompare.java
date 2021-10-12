package StringFunctions;

public class StringCompare {

	public static void main(String[] args) {
		
	

           String s1="Hello";
           String s2="Hello";
           
           String m1=new String("hi");
           String m2=new String("hi");
           
           System.out.println(m1==m2);  //fasle
           System.out.println(m1.equals(m2));  //true
           
           System.out.println(s1==s2); // true
           System.out.println(s1.equals(s2)); //true
	

	}

}
