import java.util.* ;
public class Solution {
	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
		// Write your code here
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.size();i++){
			Set<Integer> dummy=new HashSet<>();
			for(int j=i;j<arr.size();j++){
				dummy.add(arr.get(j));
				if(j-i+1==k)
				ans.add(dummy.size());
			}
		}
		return ans;
	}
}

/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(N)
*/
