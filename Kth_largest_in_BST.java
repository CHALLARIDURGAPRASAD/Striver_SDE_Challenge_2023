import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
	public static void fun(TreeNode<Integer> root,ArrayList<Integer> ans){
		if(root==null) return;
		fun(root.left,ans);
		ans.add(root.data);
		fun(root.right,ans);
	}
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
		ArrayList<Integer> ans=new ArrayList<>();
		fun(root,ans);
		if(k>ans.size()) return -1;
		return ans.get(ans.size()-k);
	}
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)+O(N)
*/
