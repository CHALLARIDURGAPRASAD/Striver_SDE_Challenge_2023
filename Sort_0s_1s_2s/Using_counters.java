import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
       int cnt1=0;
       int cnt2=0;
       int cnt3=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0) cnt1++;
           else if(arr[i]==1) cnt2++;
           else cnt3++;
       }   
       int j=0;
       for(int i=0;i<cnt1;i++)
       arr[j++]=0;
       for(int i=0;i<cnt2;i++)
       arr[j++]=1;
       for(int i=0;i<cnt3;i++)
       arr[j++]=2;
    }
}

/*
Approach:- counting the frequency of 0's 1's and 2's and placing at correct position
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(1)
*/
