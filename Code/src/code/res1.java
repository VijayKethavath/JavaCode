package code;

public class res1 {
	public static boolean poli(String str) {
		int left=0;
		int rigth=str.length()-1;
		while(left<=rigth) {
			if(str.charAt(rigth)!=str.charAt(left)) {
				return false;
			}
			left++;
			rigth--;
		}
		return true;
	}

	public static void main(String[] args) {
//	 String str="madam";
//	 String str2="";
//	 for(int i=0;i<str.length();i++) {
//		 str2=str.charAt(i)+str2;
//		 
//	 }
//	  System.out.println(str.equals(str2)?"palindrome":"Not palindrome");
		
		System.out.println(poli("madam")?"polindrome":"not");

	}

}
