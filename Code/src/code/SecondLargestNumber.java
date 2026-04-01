package code;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a=40, b=50,c=60;
		int secondlarge;
		if(a>b && a>c) {
			secondlarge=(b>c)?b:c;	
		}
		else if(b>c && b>a) {
			secondlarge=(a>c)?a:c;	
		}
		else {
			secondlarge=(b>a)?b:a;	
		}
		
		System.out.println("Second Large No :"+secondlarge);
		

	}

}
