package java_sessions;

public class IncrementalOrDecremental {

	public static void main(String[] args) {
		
		
	//Post Increment	
		int m=1;
		int n=2;
		n++;
		
		System.out.println(n); //3
		
		int x=1;
		int y=x++;
		System.out.println(x);//2
		System.out.println(y);//1
		
		
		
		int d=-97;
		int d1=d++;
		System.out.println(d1);//-97
		System.out.println(d);//-96
		
		
		
		//Pre Increment
		
		int a=1;
		int b=++a;
		System.out.println(a);//2
		System.out.println(b);//2
		
		
		//post decrement
		
		int p=1;
		int u=p--;
		System.out.println(p);//0
		System.out.println(u);//1
		
		
		int yt=23;
		System.out.println(yt++);//23
		System.out.println(++yt);//24+1=25
	}

}
