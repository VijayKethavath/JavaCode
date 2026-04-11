package NumberSeries;

public class perfectNo {
   public static void getperfect(int n) {
	   
	   int sum=0;
	   for(int i=1;i<=n/2;i++) {
		   if(n%i==0) {
			   sum+=i;
		   }
		   
	   }
	   System.out.println(sum==n?n+" is perfect number":n+" is not a perfect number");
	   
   }

	public static void main(String[] args) {
		getperfect(6);

	}

}

//Sum of its proper divisors (excluding the number itself) = the number
// Divisors of 6 → 1, 2, 3 Sum → 1 + 2 + 3 = 6

