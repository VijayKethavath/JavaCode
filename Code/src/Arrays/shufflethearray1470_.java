package Arrays;

import java.util.Arrays;

public class shufflethearray1470_ {
	
	public int[] shuffle(int []nums,int n) {
		int arr[]= new int[nums.length];
		
		for(int i=0;i<n;i++) {
			arr[2*i]=nums[i];
			arr[2*i+1]=nums[n+i];
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		
		return nums;
		
	}

	public static void main(String[] args) {
		shufflethearray1470_ ar= new shufflethearray1470_();
		ar.shuffle(new int [] {2,5,1,3,4,7},3);

	}

}
