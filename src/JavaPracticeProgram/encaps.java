package JavaPracticeProgram;

public class encaps  
{  
  public String name;
  private int age;
  private  int id;
  
  
  private String accessrole()
  {
	  System.out.println("This is access role");
	  return "role";
  }
  
  public void getrole()
  {
	  accessrole();
  }
   
  public int getAge()
  {
	  return age;
  }
  
  public int getID()
  {
	  return id;
  }
  
  public void setID(int ID)
  {
	  this.id=ID;
  }
  
  public void setAge(int age)
  {
	  this.age=age;
  }
   
   
   
   public static void main(String[] args)
   {
	   encaps cs=new encaps();
	   cs.id=23;
	   cs.age=89;
   }
    


}
