package JavaPracticeProgram;

public interface Webdriver extends SearchContext
{
	@Override
	public void findElement(String locator);
	
	public String getTitle();
	
	public void get(String URL);
	
	public void click();
	
	public void sendKeys();
	
	public void close();
	
	public static void add()
	{
		System.out.println("Hello");
	}
}
