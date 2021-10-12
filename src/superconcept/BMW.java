package superconcept;

public class BMW extends Car{
	
//	String name;
//	int price;
	
	public BMW()
	{
		super();
	}
	
	public void names()
	{
		System.out.println(super.price);
		System.out.println(name+price);
	}

	public BMW(String name, int price) {
		
		super(name, price);
		System.out.println("BMW class"+name+price);
	}
	

	
	

}
