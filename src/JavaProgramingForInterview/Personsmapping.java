package JavaProgramingForInterview;

public class Personsmapping {
	
	String name;
	int age;
	String City;

	public static void main(String[] args) {
		
		Personsmapping p1=new Personsmapping();
				
		p1.name="Hari";
		p1.age=20;
		p1.City="Bangalore";
		
		Personsmapping p2=new Personsmapping();
		p2.name="Giri";
		p2.age=25;
		p2.City="Mangalore";
		
		Personsmapping p3=new Personsmapping();
		p3.name="Mani";
		p3.age=28;
		p3.City="Hydrabad";
		
		p1=p2;
		p2=p3;
		
		int x=10,y=15,z=20;
		
		x=y;
		y=z;
		
		System.out.println(x+" "+y+" "+ z);
		
		
	
		
		System.out.println(p1.name +" "+p1.age+" "+p1.City);
		System.out.println(p2.name +" "+p2.age+" "+p2.City);
		System.out.println(p3.name +" "+p3.age+" "+p3.City);

	}

}
