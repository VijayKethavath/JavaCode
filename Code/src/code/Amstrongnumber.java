package code;

public class Amstrongnumber {
	public static void amstrong(int n) {
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

		if(num==sum) {
			System.out.println("Amstrong number");
		}
		else System.out.println("Not a Amstrong numb");
	}

	public static void main(String[] args) {
		amstrong(153);

	}

}
