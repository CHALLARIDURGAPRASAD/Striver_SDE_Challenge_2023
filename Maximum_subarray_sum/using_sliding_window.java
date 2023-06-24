import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
	     long max=0;
		 for(int i=0;i<n;i++){
			 long sum=0;
			 for(int j=i;j<n;j++){
				 sum+=arr[j];
				 max=Math.max(max,sum);
			 }
		 }
		 return max;
	}

}
/*
TIME COMPLEXITY:- O(N^2)
  SPACE COMPLEXITY:- O(1)
  */
