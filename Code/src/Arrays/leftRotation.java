package Arrays;

import java.util.*;

public class leftRotation {
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	

	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n=arr.length;
		int k=2;
		k=k%n;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		System.out.println("rigth Rotation"+Arrays.toString(arr));
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

//	public static void left(int [] arr,int k) {
//		for(int i=0;i<k;i++) {
//			int temp=arr[0];
//			for(int j=1;j<arr.length;j++) {
//				arr[j-1]=arr[j];
//			}
//			arr[arr.length-1]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//
//	public static void main(String[] args) {
//		int[] arr= {1,2,3,4,5};
//		left(arr,3);
//
//	}
//
//}
