package java_sessions;

public class People {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		People p1=new People();
		
		p1.name="Sumanth";
		p1.age=20;
		p1.city="Bangalore";
		
		People p2=new People();
		
		p2.name="Sandesh";
		p2.age=22;
		p2.city="Mangalore";
		
		People p3=new People();
		
		p3.name="Sumukh";
		p3.age=18;
		p3.city="Hydrabad";
		
		
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		System.out.println("----------------");
		
		p1=p2;
		
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		System.out.println("-----------");
		
		p2=p3;
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		System.out.println("----------");
		
		p3=p1;
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		System.out.println("----------");
		
		
		

	}

}
