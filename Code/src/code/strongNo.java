package code;

public class strongNo {
	public static void strong(int n) {
		int num=n;
		int sum=0;
		while(n>0) {
			int temp=n%10;
			int fact=1;
			for(int i=1;i<=temp;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		System.out.println(num==sum?num+" is a strong number":num+" is not a strong number");	
	}
	
	public static void main(String[] args) {
		strong(145);
	}
}

//Sum of factorial of its digits = the number itself
//145 ->1 + 24 + 120 = 145


