package Final_Interview;

public class ReverseWord {

	public static void main(String[] args) {
	
		
		String word="Hello im automation engineer";
		
		String[] SplitWord = word.split(" ");
		
		for(int i=SplitWord.length-1;i>=0;i--)
		{
			System.out.print(SplitWord[i]+" ");
		}
		
		System.out.println(SplitWord.length);

	}

}
