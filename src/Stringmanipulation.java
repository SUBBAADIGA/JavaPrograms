import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Stringmanipulation {

	public static void main(String[] args) {
		
		
		String str="Hello Test String manipulation Test";
		
//		System.out.println(str.length());
//		
//		System.out.println(str.charAt(6));
//		
//		System.out.println(str.indexOf('i'));
		
		 String Server="Server Details: 192.168.100.117";
		 
		 String IP = Server.substring(16);
		System.out.println(IP.trim());

		
		
		//First Occurence
		System.out.println(str.indexOf('i'));
		
		//second occurence
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
		//Third occurence
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		
		//Fourth Occuerence
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1));
		
		
		System.out.println(str.lastIndexOf("Test"));
		 
		System.out.println(str.indexOf("Test"));
		
		System.out.println(str.indexOf("Test", str.indexOf("Test")+1));
		
		
		//SubString
		
		String msg="This is your transaction ID is 2345674";
		
		System.out.println(msg.indexOf("is"));
		
		System.out.println(msg.indexOf("is", msg.indexOf("is")+1));
		
		System.out.println(msg.indexOf("is", msg.indexOf("is", msg.indexOf("is")+1)+1));
		
		
		System.out.println(msg.substring(msg.indexOf("is", msg.indexOf("is", msg.indexOf("is", msg.indexOf("is")+1)+1))+3, msg.length()));
		
		String DOB="28/06/1996";
		
		System.out.println(DOB.replace('/', '-'));
		
		//Split
		
		String lang="Java:phython:ruby:r";
		
		String arr[]=lang.split(":");
		
		for(String e:arr)
		{
			System.out.println(e);
		}
		
		
		String output="100Test";
		
		int num=Integer.parseInt(output.substring(0, 3));
		System.out.println(num);

	}

}
