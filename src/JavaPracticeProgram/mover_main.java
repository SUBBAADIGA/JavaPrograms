package JavaPracticeProgram;

public class mover_main {

	public static void main(String[] args) {

		mover_child m=new mover_child();
		m.start();
		m.stop();
		m.start();
		m.start(1);
		
		
	  mover_parent c1=new mover_child();	
	  
	  System.out.println("-------------");
	  
	  c1.start();
	  c1.stop();
	  
	}

}
