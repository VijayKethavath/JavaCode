package code;

public class string2 {

	public static void main(String[] args) {
		String name="Bittu@123";
		String upper="";
		String loewr="";
		String no="";
		String spl="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch >= 'A' && ch<='Z') {
				upper+=ch;
			}
			else if(ch >= 'a' && ch<='z') {
				loewr+=ch;
				
			}
			else if(ch >= '0' && ch<='9') {
				no+=ch;
				
			}
			else {
				spl+=ch;
			}
			
			
		}
		System.out.println("upper :"+upper);
		System.out.println("Lower :"+loewr);
		System.out.println("no :"+no);
		System.out.println("Spl :"+spl);

	}

}
