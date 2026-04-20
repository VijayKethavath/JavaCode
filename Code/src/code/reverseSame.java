package code;
import java.util.Arrays;

public class reverseSame {

	public static void main(String[] args) {
		String str="hi hello ram";
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		String res="";
		
		for(int i=0;i<arr.length;i++) {
			String st="";
			for(int j=0;j<arr[i].length();j++) {
				st=arr[i].charAt(j)+st;
				
			}
			res=res+st+" ";
		}
		System.out.println(res.trim());
		

	}

}
