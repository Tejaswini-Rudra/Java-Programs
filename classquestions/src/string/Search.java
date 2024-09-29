package string;

public class Search {
	public static void main(String[]args) {
		String s ="java is java because of java";
		char[]ch=s.toCharArray();
		char targetchar='a';
		int c=0;
		for(char chs:ch) {
			if(chs==targetchar) {
				c++;
			}
		}
			System.out.println("target char occured times"+c);
		
	}

}
