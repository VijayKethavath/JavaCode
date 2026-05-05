package Arrays;

import java.util.Arrays;

public class productofArray238 {
	public static int[] product(int[]nums) {
		int n=nums.length;
		int left[]=new int[n];
		
		left[0]=1;
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*nums[i-1];
			
		}
		int right=1;
		for(int i=n-1;i>=0;i--) {
			left[i]=left[i]*right;
			right=right*nums[i];
		}
		
		System.out.println(Arrays.toString(left));
		return left;
	}

//		int arr[]=new int[nums.length];
//		for(int i=0;i<nums.length;i++) {
//			int prod=1;
//			for(int j=0;j<nums.length;j++) {
//				if(i==j) continue;
//				prod*=nums[j];
//			}
//			arr[i]=prod;
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}

	public static void main(String[] args) {
		productofArray238 pr= new productofArray238();
		pr.product(new int[]{1,2,3,4});

	}
	}


