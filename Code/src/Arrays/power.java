package Arrays;



public class power {
	public static void main(String[] args) {
		int n=100;
		
		if(n==0) {
			System.out.println("no 0");
			return;
		}
		while(n%4==0) {
			n/=4;
		}
			
			System.out.println(n==1?"yes":"no");
		
		
	}

}
