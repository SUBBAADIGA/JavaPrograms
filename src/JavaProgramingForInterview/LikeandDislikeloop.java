package JavaProgramingForInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LikeandDislikeloop {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	         String A = br.readLine();
	         String P = br.readLine();

	         int out_ = count_like_dislike(A, P);
	         System.out.println(out_);

	         wr.close();
	         br.close();

	}
	
	  static int count_like_dislike(String A, String P){
		     
	  int Acount = Integer.parseInt(A);
	  int Bcount = Integer.parseInt(P);
	  
	  int temp=Acount;
	  int tempp=Bcount;
	  int likecounter=0;
	  int dislikecounter=0;
	  
	  
	 char[] temparray = A.toCharArray();
	 char[] tempparray = P.toCharArray();
	 
	 for(int i=0;i<=(temparray.length)-1;i++)
	 {
		 if((temparray[i]=='1')&&(temparray[i]==tempparray[i]))
		 {
			
			 likecounter=likecounter+1;
		 }
		 else
		 {
			 dislikecounter=dislikecounter+1;
		 }
	 }
	  
	  
     return likecounter;
	 
	  
	     
	  }	 

}
