package JavaPracticeProgram;

import java.util.ArrayList;

public class ReturnCollege {

	public static void main(String[] args) {
		
		ArrayList<String> cDeatils = getCollageFaculty("RRIT");
		
		for(String e:cDeatils)
		{
			System.out.println(e);
		}

	}

	
	public static ArrayList<String> getCollageFaculty(String CollageName)
	{
		
		ArrayList<String> fList = new ArrayList<String>();
		
		switch (CollageName) {
		case "SDM":
			fList.add("SDM Ramesh");
			fList.add("SDM RAJ");
			break;
			
		case "MMIT":
			fList.add("MMIT Ramesh");
			fList.add("MMIT RAJ");
			break;

		default:
			System.out.println("not a valid collage");
			break;
		}
		return fList;
	}
}
