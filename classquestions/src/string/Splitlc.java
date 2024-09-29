package string;

public class Splitlc {
public static void main(String[]args) {
	String s="java is java because of java";
	String [] words =s.split(" ");
	for(String word:words) {
		System.out.println(word.toUpperCase()+"--->"+word.toLowerCase()+"--->"+word.length());
	}
	
	
}
}
