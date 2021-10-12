package JavaProgramingForInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_buffer {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// read the name from the input 
		
		String line = br.readLine();
		
		  // print the name
		
		System.out.println("Hello "+line);
	}

}
