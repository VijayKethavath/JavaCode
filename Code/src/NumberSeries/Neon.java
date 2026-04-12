package NumberSeries;

public class Neon {
	public static void getneon(int n) {
	
		int square=n*n;
		int sum=0;
		
		while(square>0) {
			int temp=square%10;
			sum=sum+temp;
		    square/=10;
		}
		
		System.out.println(n==sum?n+" Neon number":n+" Not a neon number");	
	}

	public static void main(String[] args) {
		getneon(9);
		getneon(12);

	}

}

//Sum of digits of its square = the number itself
//9 → 9 × 9 = 81 → 8 + 1 = 9

