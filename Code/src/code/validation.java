package code;

public class validation {

	public static void main(String[] args) {
		String str="Amdin@123";
		int u=0;
		int l=0;
		int n=0;
		int s=0;
		int count=0;
		for(int i =0;i<str.length();i++) {

			char ch=str.charAt(i);
			if(ch >= 'A' && ch<='Z' && u==0){
				u=1;
				count++;
				

			}
			if(ch >= 'a' && ch<='z' && l==0) {
				l=1;
				count++;
			
			}
			if(ch >= '0' && ch<='9' && n==0) {
				n=1;
				count++;

			}
			if(ch=='@' && s==0) {
				s=1;
				count++;
				
			}


		}
		if(count==4) {
			System.out.println("Pattern ok");
		}
		else {
			System.out.println("not ok");
			}



	}


}


