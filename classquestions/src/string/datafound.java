package string;

public class datafound {
	public static void main(String[]args) {
		String s ="your students are good students nice students please focus on work";
		int findex=s.indexOf(" students");
		if(findex!=-1) {
			System.out.println("data found at position:"+s.indexOf("students"));
		}
		else {
			System.out.println("data cannot be found"); 
		}
	}

}
