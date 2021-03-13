package WebDriverArchitecture;

public interface Webdriver extends SearchContext{
	
	@Override
	public void findElement(String locator);
	
	public void get(String url);
	
	public String getTitle();
	
	public void click();
	
	public void sendKeys();
	
	public void close();
	

}
