package superconcept;

public class Car {
	
	String name;
	int price;
	
	public Car() {
		System.out.println("This is Car class default constructor");
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("Car class"+name+price);
	}
	
	
	
	

}
