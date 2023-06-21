
public class Solution {
	public static boolean fun(BinaryTreeNode<Integer> root,int x){
		if(root==null) return false;
		if(root.data==x) return true;
		boolean pick=false;
		boolean non=false;
		if(x<root.data){
			pick=fun(root.left,x);
		}
		else
		non=fun(root.right,x);
		return pick || non;

	}
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		return fun(root,x);
	}
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
