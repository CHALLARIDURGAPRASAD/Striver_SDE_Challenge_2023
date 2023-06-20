
public class Solution {
     public static void preorder(TreeNode root,List<Integer> ans){
		 if(root==null) return;
		 ans.add(root.data);
		 preorder( root.left, ans);
		 preorder(root.right, ans);
	 }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> ans=new ArrayList<>();
		preorder(root, ans);
		return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
