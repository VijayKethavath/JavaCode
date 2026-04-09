package code;

public class string1 {

	public static void main(String[] args) {
	String str="java";
	String res="";
	for(int i=0;i<str.length();i++) {
		
		res+=(char)(str.charAt(i)-32);
		
	}
	System.out.println(res);
	

	}

}


