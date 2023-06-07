/* If in the question is mentioned that every first element in the row is greater that the element present in last of previous row than this is for that problem
example:-    1 2 3 4 
             5 6 7 8
             9 10 11 12
             */
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
TIME COMPLEXITY:- O(logn*m)
SPACE COMPLEXITY:- O(1)
*/
