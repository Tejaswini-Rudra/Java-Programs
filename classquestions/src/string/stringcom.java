package string;

public class stringcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		
		for(int i=1;i<=9;i++) {
			s=s+i;
			
		}
		System.out.println(s);
		System.out.println();
		String s2="";
		StringBuffer buffer=new StringBuffer();
		for(int j=1;j<=9;j++) {
			buffer.append(j);
		}
		System.out.println(buffer);
	}
	
	
	

}
