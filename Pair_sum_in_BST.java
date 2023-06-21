
public class Solution {
	public static void fun(BinaryTreeNode root,ArrayList<Integer> ans){
		if(root==null) return ;
		fun(root.left,ans);
		ans.add(root.data);
		fun(root.right,ans);
	}
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		ArrayList<Integer> ans=new ArrayList<>();
		fun(root,ans);
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<ans.size();i++)
		map.put(ans.get(i),map.getOrDefault(ans.get(i),0)+1);
		for(int i=0;i<ans.size();i++){
			int diff=k-ans.get(i);
			if(map.containsKey(diff)==true) return true;
		}
		return false;

	}
}

/*
TIME COMPLEXITY:- O(N)+O(N)+O(N)
SPACE COMPLEXITY:- O(N)+O(N)
*/
