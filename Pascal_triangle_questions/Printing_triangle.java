import java.io.*;
import java.util.* ;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Long> row(int row1){
		ArrayList<Long> curr=new ArrayList<>();
		curr.add((long)1);
		long ans=1;
		for(int i=1;i<row1;i++){
              ans=ans*(row1-i);
			  ans=ans/i;
			  curr.add(ans);
		}
		return curr;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> ans=new ArrayList<>();
                  for(int i=1;i<=n;i++){
					 ans.add(row(i));
				  }
				  return ans;
	}
}

/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(1);
*/
