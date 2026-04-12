package NumberSeries;

public class HarshadNumber {
	public static void getHarshed(int n) {
		
		int num=n;
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum+=temp;
			n/=10;
		}
		System.out.println(num%sum==0?num+" is harshed number":num+" is not a harshed number");		
	}
	
	public static void main(String[] args) {
		getHarshed(18);
		getHarshed(19);
	}
}

//Digits 18 → 1 + 8 = 9
//18 ÷ 9 = 2
//Divisible → 18 is a A harshed Number is a number that is:Divisible by the sum of its digits


