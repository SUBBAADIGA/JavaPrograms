package JavaPracticeProgram;

public class TestClass {

	public static void main(String[] args) {
		
		String Browser="firefox";
		Webdriver driver=null;
		
		switch (Browser) {
		case "chrome": 
			driver=new ChromeDriver();
			driver.get("amazon.com");
			driver.findElement("locator");
			String title = driver.getTitle();
			System.out.println(title);
			driver.click();
			driver.close();
			break;
			
		case "firefox": 
			driver=new FirefoxDriver();
			driver.get("amazon.com");
			driver.findElement("locator");
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.click();
			driver.close();
			break;

		default:
			System.out.println("Please pass the correct browser details");
			break;
		}

	}

}
