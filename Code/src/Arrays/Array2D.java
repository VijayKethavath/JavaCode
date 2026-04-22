package Arrays;

import java.util.Arrays;

public class Array2D {
	public static void add(int arr[][],int arr2[][] ) {
		int res[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				res[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		
		
		System.out.println("Sum: "+Arrays.deepToString(res));
		
	int trans[][]=new int[res.length][res[0].length];
	for(int i=0;i<res[0].length;i++) {
		for(int j=0;j<res.length;j++) {
			trans[i][j]=res[j][i];
			
		}
	}
	
	System.out.println("Transpose: "+Arrays.deepToString(trans));
	}
	
	public static void mul(int arr[][],int arr2[][] ) {
		int re[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				for(int k=0;k<arr[0].length;k++) {
					re[i][j]=re[i][j]+arr[i][k]*arr2[k][j];
				}
			}
			}
		System.out.println("Multipilcation: "+Arrays.deepToString(re));
	}
			

	
		
	

	public static void main(String[] args) {
		int [][] arr= {{1,2},{3,4}};
		int [][] arr2= {{4,3},{2,1}};
		
		add(arr,arr2);
		mul(arr,arr2);

	}

}
