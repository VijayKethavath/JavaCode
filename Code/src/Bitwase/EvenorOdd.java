package Bitwase;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		int n=sc.nextInt();
		if((n&1)==0) {                           // 6=1 1 0 +  
			System.out.println("even");          // 1=0 0 1 
		}                                        //   0  0  0
		else if((n&1)==1) {
			System.out.println("odd");           // 5=1 0 1
		}                                        // 1=0 0 1 
		else {                                   //    0 0 1
			System.out.println("Invalid input");
		}
		sc.close();
		
		

	}

}
