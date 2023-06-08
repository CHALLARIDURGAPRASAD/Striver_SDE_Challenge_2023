import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			if(map.get(arr[i])>n/2)
			return arr[i];
		}
		return -1;
	}
}

/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:-O(N)
*/
