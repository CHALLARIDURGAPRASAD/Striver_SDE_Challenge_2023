
public class Solution {
    public static void inorder(TreeNode root,List<Integer> ans){
       if(root==null) return;
       inorder(root.left, ans);
       ans.add(root.data);
       inorder(root.right, ans);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
