package JavaPracticeProgram;

public class constp {
	
	String Username;
	String EmailID;
	int EMPID;
	boolean active;
	
	public constp(String Username,String EmailID,int EMPID,boolean active) {
		
		this.Username=Username;
		this.EmailID=EmailID;
		this.EMPID=EMPID;
		this.active=active;
		
	}
	

	public static void main(String[] args) {
		
		constp obj=new constp("Subrahmanya", "subbaadiga@test.com", 1234, true);
		
		System.out.println(obj.Username+ obj.EmailID+ obj.EMPID+ obj.active);
		

	}

}
