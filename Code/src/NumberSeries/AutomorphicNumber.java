package NumberSeries;

public class AutomorphicNumber {
	public static void isAutomorphic(int n) {
		int num=n;
		int square=n*n;
		while(num>0) {
			if(num%10 != square%10) {
				System.out.println(n+" is not a Automorphic number");
				return;
			}
			square/=10;
			num/=10;
		}
		System.out.println(n+" is Automorphic number");
	}
	public static void main(String[] args) {
		isAutomorphic(625);
		isAutomorphic(4);
	}
}

// a Number whose square ends with same digits of as the number of its self ex:5^2=25,6^2=36,25^=625 
