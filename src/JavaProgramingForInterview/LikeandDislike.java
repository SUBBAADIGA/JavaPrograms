package JavaProgramingForInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LikeandDislike {

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
	  
	  
	  
	  
	  
	  while(temp>0 && tempp>0)
	  {
		  int digit = temp%10;
		  int pdigit=tempp%10;
		  
		  if(digit==1 && pdigit==1)
		  {
			  likecounter=likecounter+1;
		  }
		  else if(digit==0 && pdigit==0)
		  {
			  dislikecounter=dislikecounter+1;
		  }
		  
		  temp=temp/10;
		  tempp=tempp/10;
	  }
	  return likecounter;
	  
	     
	  }	 

}
