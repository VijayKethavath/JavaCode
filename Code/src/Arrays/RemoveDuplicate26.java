package Arrays;

import java.util.Arrays;

public class RemoveDuplicate26 {
	
	 public static  int removeDuplicates(int[] nums) {
		 int ans=0;
		 if(nums.length==0) return 0;
		 
		 for(int i=1;i<nums.length;i++) {
			 if(nums[i]!=nums[ans]) { // 2-2 0-1
				 ans++; // 1
				nums[ans]=nums[i] ; // 1-1 =2-2
				
			 }
			
		 }
		 System.out.println(Arrays.toString(nums));
		 return ans+1;
	        
	    }

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1,1,2}));

	}

}
