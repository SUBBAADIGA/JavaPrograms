package java_sessions;

public class StringConcatination {

	public static void main(String[] args) {
		
		String x="Selenium";
		String y="Java";
		
		int a=100;
		int b=23;
		
		double d1=12;
		double d2=95;
		
		System.out.println(d1+y); //SeleniumJava
		System.out.println(a+d1+x);//112.33Selenium
		System.out.println(d1+d2);//107.0
		System.out.println(a+b+x+y);//123SeleniumJava
		System.out.println(a+x+d1+b+d2+b);//100Selenium12.02395.023
		
		System.out.println(++d1+a+++d2);//208.0>>12+100+96
		
		System.out.println(x+(d1+a)+y);//Selenium+(13+101)+Java>>Selenium114.0Java
		
		System.out.println("value is "+ a+d1);//value is 10113.0
		
		
		int t1=12;
		int t2=3;
		double x1=t1/t2;
		System.out.println(x1);//2.0
		
		System.out.println(12%3);
		System.out.println(11/11);//1
		System.out.println(11%11);//0
		
		
	

	}

}
