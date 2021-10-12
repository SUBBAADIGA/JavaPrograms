package JavaPracticeProgram;

public class encapscall {
	
	public static void main(String[] args)
	{
		encaps cs=new encaps();
		cs.name="satish";
		System.out.println(cs.name);
		cs.getrole();
		
		cs.setAge(53);
		cs.setID(41);
		System.out.println(cs.getAge());
		System.out.println(cs.getID());
	
	}
	

}
