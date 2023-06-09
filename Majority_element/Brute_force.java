import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		for(int i=0;i<n;i++){
			int temp=arr[i];
			int cnt=0;
			for(int j=0;j<n;j++){
				if(arr[j]==temp)
				cnt++;
			}
			if(cnt>n/2)
			return temp;
		}
		return -1;
	}
  
  /*
  TIME COMPLEXITY:- O(N^2)
  SPACE COMPLEXITY:- O(1)
  */
