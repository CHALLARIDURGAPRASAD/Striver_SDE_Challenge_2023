
public class Solution {
    public static void postorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.data);
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
