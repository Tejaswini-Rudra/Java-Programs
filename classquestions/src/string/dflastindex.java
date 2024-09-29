package string;

public class dflastindex {
	public static void main(String[]args) {
		String s = "your students are good nice students please focus on work";
		int bindex=s.lastIndexOf("students");
		if(bindex!=-1) {
			System.out.println("data found at position:"+s.lastIndexOf("students"));
		}
		else {
			System.out.println("data cannot be found");
		}
	}
}