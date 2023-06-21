public class Solution {	
	public static boolean check(StringBuilder str){
		int low=0;
		int high=str.length()-1;
		while(low<=high){
			if(str.charAt(low)!=str.charAt(high))
			return false;
			low++;
			high--;
		}
		return true;
	}
	public static String longestPalinSubstring(String str) {
		// Write your code here.
	    int max=0;
		String ans="";
		for(int i=0;i<str.length();i++){
			StringBuilder dummy=new StringBuilder();
			for(int j=i;j<str.length();j++){
				dummy.append(str.charAt(j));
				if(check(dummy)==true && dummy.length()>max){
					max=dummy.length();
					ans=dummy.toString();
				}
			}
		}
		return ans;
	}
}

/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(N)
*/
