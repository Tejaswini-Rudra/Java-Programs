package string;

public class Split {
	public static void main(String[]args) {
		String s= "java is java because of java";
		String[]words = s.split(" ");
		for(String word:words) {
			if(word. startsWith("j")) {
				System.out.println(word);
			}
		}
	}

}
