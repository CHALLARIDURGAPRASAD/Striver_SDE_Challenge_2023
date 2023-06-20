import java.util.* ;
import java.io.*; 
public class Solution {
    public static void fun(int ind,int num[],int sum,ArrayList<Integer> ans){
        if(ind==num.length){
         ans.add(sum);
         return;
        }
        sum+=num[ind];
        fun(ind+1,num,sum,ans);
        sum-=num[ind];
        fun(ind+1,num,sum,ans);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> ans=new ArrayList<>();
        fun(0,num,0,ans);
        Collections.sort(ans);
        return ans;
    }

}
/*
TIME COMPLEXITY:- O(2*N) +O(NlogN)
SPACE COMPLEXITY:- O(N)
*/
