import java.util.*;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		Set<Integer> ans=new HashSet<>();
		for(int i=0;i<n;i++)
		ans.add(arr.get(i));
		return ans.size();
	}
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
