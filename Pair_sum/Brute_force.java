import java.io.*;
import java.util.* ;
public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(arr[i]+arr[j]==s){
                  int arr1[]=new int[2];
                  arr1[0]=arr[i];
                  arr1[1]=arr[j];
                  Arrays.sort(arr1);
                  ans.add(arr1);
              }
          }
        }
        
        return ans;
    }
}

/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(N)
*/
