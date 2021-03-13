package Typecasting;

public class mainClass {

	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		obj.add();
		
		ClassA ref=new ClassB();
		ref.add();
		
		ClassB refa=(ClassB) new ClassA();
		refa.add();
		
	}

}
