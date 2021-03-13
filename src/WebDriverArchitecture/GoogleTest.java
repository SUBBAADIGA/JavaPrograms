package WebDriverArchitecture;

public class GoogleTest {
	
	static Webdriver driver;
	 static String browser="chrome";

	public static void main(String[] args) {
		
		//String browser="IEEDGE";
	
	switch (browser) {
	case "chrome":
    driver=new ChromeDriver();
	break;
			
			
	case "Firefox":
	driver=new Firefox();
	break;
				
	case "IEEDGE":
	driver=new IEEdge();
	break;				
				
				

		default:
			System.out.println("Please pass the correct browser details");
			break;
		}
	
	driver.findElement("Test");
	driver.get("https://www.google.com");
	driver.getTitle();
	driver.sendKeys();
	driver.click();
	driver.close();

	}

}
		
