
public class Solution {
    public static void fun(TreeNode<Integer> root,ArrayList<Integer> ans){
        if(root==null) return ;
        fun(root.left,ans);
        ans.add(root.data);
        fun(root.right,ans);
    }
    public  static int findCeil(TreeNode<Integer> node, int x) {
        ArrayList<Integer> ans=new ArrayList<>();
        fun(node,ans);
        int max=Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>=x && ans.get(i)<=max)
            max=ans.get(i);
        }
        if(max==Integer.MAX_VALUE)
        max=-1;
        return max;
    }
}

/*
TIME COMPLEXITY:- O(N)+O(N)
SPACE COMPLEXITY:- O(N)+O(N)
*/
