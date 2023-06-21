
public class Solution {
    public static boolean fun(BinaryTreeNode<Integer> root1 , BinaryTreeNode<Integer> root2){
       if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data.equals(root2.data) && fun(root1.left,root2.right) && fun(root1.right,root2.left));
    }
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null) return true;
        return fun(root.left,root.right);
    }
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N) [STACK SPACE]
*/
