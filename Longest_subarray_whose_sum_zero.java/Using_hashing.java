import java.io.*;
import java.util.* ;
import java.util.ArrayList;
public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
      HashMap<Integer,Integer> map=new HashMap<>();
	  int max=0;
	  int sum=0;
	  for(int i=0;i<arr.size();i++){
        sum+=arr.get(i);
		if(sum==0)
		max=Math.max(max,i+1);
		if(map.containsKey(sum)==true){
			max=Math.max(max,i-map.get(sum));
		}
		else
		map.put(sum,i);
	  }
	  return max;
	}
}
/*
TIME COMPLEXITY:- O(NlogN)
SPACE COMPLEXITY:- O(N)
*/
