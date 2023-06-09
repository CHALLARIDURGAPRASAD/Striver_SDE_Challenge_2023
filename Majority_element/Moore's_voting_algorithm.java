import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ele=-1;
		int cnt=0;
		for(int i=0;i<n;i++){
			if(cnt==0){
				ele=arr[i];
				cnt++;
			}
			else if(arr[i]==ele)
			cnt++;
			else
			cnt--;
		}
		int temp=0;
		for(int i=0;i<n;i++){
			if(arr[i]==ele)
			temp++;
		}
		if(temp>n/2) return ele;
		return -1;
	}
}

/*
TIME COMPLEXITY:- O(N)+O(N)
SPACE COMPLEXITY:- O(1)
*/
