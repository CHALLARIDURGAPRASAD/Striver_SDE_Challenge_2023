
public class Solution {
	public static void inorder(BinaryTreeNode<Integer> root,ArrayList<Integer> in){
		if(root==null)
		return ;
		inorder(root.left,in);
		in.add(root.data);
		inorder(root.right,in);
	}
	public static void  post(BinaryTreeNode<Integer> root,ArrayList<Integer> po){
		if(root==null)
		return ;
		post(root.left,po);
        post(root.right,po);
		po.add(root.data);
	}
	public static void  preorder(BinaryTreeNode<Integer> root,ArrayList<Integer> pre){
		if(root==null)
		return ;
		pre.add(root.data);
		preorder(root.left,pre);
		preorder(root.right,pre);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> in=new ArrayList<>();
		ArrayList<Integer> pre=new ArrayList<>();
		ArrayList<Integer> po=new ArrayList<>();
		inorder(root,in);
		post(root,po);
		preorder(root,pre);
		List<List<Integer>> ans=new ArrayList<>();
		ans.add(new ArrayList<>(in));
		ans.add(new ArrayList<>(pre));
		ans.add(new ArrayList<>(po));
		return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(N)+O(N)
  SPACE COMPLEXITY:- O(N)+O(N)+O(N)
  */
