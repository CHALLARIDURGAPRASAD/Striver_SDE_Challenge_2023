import java.io.*;
import java.util.* ;
import java.util.ArrayList;
public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
       int ans=0;
	   for(int i=0;i<arr.size();i++){
		   int sum=0;
		   for(int j=i;j<arr.size();j++){
			   sum+=arr.get(j);
		   if(sum==0)
		   ans=Math.max(ans,j-i+1);
		   }
	   }
	   return ans;
	}
}
/*
TIME COMPLEXITY:- O(N*2)
SPACE COMPLEXITY:- O(1)
*/
