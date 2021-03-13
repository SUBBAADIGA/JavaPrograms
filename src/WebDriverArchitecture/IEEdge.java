package WebDriverArchitecture;

public class IEEdge implements Webdriver{

	 public IEEdge() {
			System.out.println("IEEDGE Firefox");
			System.out.println("IEEDGE is launched");
		}

		@Override
		public void findElement(String locator) {
			
			
			System.out.println("finding the element with :"+" " + locator);
			
		}

		@Override
		public void get(String url) {
			System.out.println("Enter the Url"+url);
			
		}

		@Override
		public String getTitle() {
			System.out.println("Getting the page title");
			return "Google";
		}

		@Override
		public void click() {
			System.out.println("Click on element");
			
		}

		@Override
		public void sendKeys() {
			System.out.println("Enter the values in the text field");
			
		}

		@Override
		public void close() {
	     System.out.println("Closing the browser");		
		}

	}
