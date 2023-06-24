import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
	     long max=0;
		 long sum=0;
		 for(int i=0;i<n;i++){
			 sum+=arr[i];
			 max=Math.max(max,sum);
			 if(sum<0)
			 sum=0;
		 }
		 return max;
	}

}
/*
TIME COMPLEXITY:- O(N)
  SPACE COMPLEXITY:- O(1)
  */
