package Arrays;

public class MajorityElement169 {
	public static int majorityElement(int[] nums) {
		int count=0;
		int value=0;
		for (int num : nums) {
			if(count==0) {
				value=num;
			}
			if(num==value) {
				count++;
			}
			else {
				count--;
			}
			return value;
		}
		return value;
	}
	
//		int max=nums.length;
//		for(int i=0;i<max;i++) {
//			int count=0;
//			for(int j=0;j<max;j++) {
//				if(nums[i]==nums[j]) {
//					count++;
//				}
//
//			}
//			if(count>max/2) {
//				return nums[i];
//			}
//
//		}
//		return -1;
//
//	}

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {3,2,3}));

	}
}


