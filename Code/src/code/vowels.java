package code;

public class vowels {

	public static void main(String[] args) {
		String str="Apple";
		String str2=str.toUpperCase();
		int count=0;
		int con=0;
//		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			if(str2.charAt(i)=='A' || str2.charAt(i)=='E' || str2.charAt(i)=='I' || str2.charAt(i)=='O' || 
					str2.charAt(i)=='U') {
				count++;
			}
			else {
				con++;
				
			}
		}
		System.out.println("vowels :"+count);
		System.out.println("Consonant "+ con);

	}

}
