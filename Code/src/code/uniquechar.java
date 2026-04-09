package code;

public class uniquechar {
	public static char unique(String str) {
		boolean arr[]=new boolean[str.length()];
		for(int i=0;i<str.length();i++) {
			if(arr[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
					arr[j]=true;
					
				}
			}
			if(count==1) {
			System.out.println(str.charAt(i)+"->"+count);
			}
			else {
				System.out.println("duplicated values :"+str.charAt(i)+"->"+count);
			}
		}
		return 0;
		
		
	}

	public static void main(String[] args) {
		String str="leetcode";
		unique(str);
		

	}

}
