package JavaPracticeProgram;

public class ConstructorCopy {
	   //Java Program to Copy the values from one object to another Object.
	String name;
	int id;
	
	ConstructorCopy(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	
	//constructor to initialize another object   
	
	public ConstructorCopy(ConstructorCopy c) {
		
		this.id=c.id;
		this.name=c.name;
	}

	public static void main(String[] args) {
 
		ConstructorCopy c1 = new ConstructorCopy("Subrahmanya", 123);
		
		ConstructorCopy c2 = new ConstructorCopy(c1);
		System.out.println(c1.id+c1.name);
		System.out.println(c2.id+c2.name);
	}

}
