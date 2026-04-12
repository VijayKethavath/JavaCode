package code;

public class Amstrongnumber {
	public static void amrstrong(int n) {
		int count=0;
		for(int i=n;i>0;i=i/10) {
			count++;
		}
		
		int num=n;
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum+=(int)Math.pow(temp,count);
			n/=10;
		}

		System.out.println(num==sum?num+" is a Armstrong number":num+" is a Not a Armstrong numb");	
	}
	public static void main(String[] args) {
		amrstrong(153);
	}
}

//A number that is equal to the sum of its digits raised to the power of number of digits
//1³ + 5³ + 3³ = 1 + 125 + 27 = 153
