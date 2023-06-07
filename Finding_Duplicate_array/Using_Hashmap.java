import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n=mat.size();
        int m=mat.get(0).size();
        int low=0;
        int high=n*m-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mat.get(mid/m).get(mid%m)==target) return true;
            else if(mat.get(mid/m).get(mid%m)<target)
            low++;
            else
            high--;
        }
        return false;
    }
}

/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:-O(N)
*/
