package JavaProgramingForInterview;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareURL {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(new URL("https://qademo.symphonysummit.com").equals(new URL("https://14.98.0.36")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
