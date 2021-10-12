package JavaPracticeProgram;

public class FirefoxDriver implements Webdriver {
	
	

       public FirefoxDriver() {
		// TODO Auto-generated constructor stub
		 
		 System.out.println("Launching Firefox");
		 System.out.println("Browser is launched");
	}

	@Override
	public void findElement(String locator) {
       System.out.println("Finding Element in firefox"+locator);		
	}

	@Override
	public String getTitle() {
		System.out.println("This is title");
		return "Google";
	}

	@Override
	public void get(String URL) {
        System.out.println("This is get URl");		
	}

	@Override
	public void click() {
     System.out.println("Click");		
	}

	@Override
	public void sendKeys() {
        System.out.println("");		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	

}
