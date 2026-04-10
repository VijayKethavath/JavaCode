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
		if(num==sum) {
			System.out.println(num+" is a strong number");
		}
		else {
			System.out.println(num+" is not a strong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strong(145);
	}
}


