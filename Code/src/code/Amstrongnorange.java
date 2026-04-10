package code;


public class Amstrongnorange {
	public static void amstrong(int start ,int end) {
		
		while(start<=end) {
		int count=0;
		int n=start;
		for(int i=n;i>0;i=i/10) {
			count++;
//			System.out.println(count);
			
		}
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+(int)Math.pow(temp,count);
			n/=10;
		}
		
		if(start==sum) {
			System.out.println(start);
		}
		start++;
	}
	}

	public static void main(String[] args) {
		amstrong(100,2000);

	}

}
