import java.io.*;
import java.util.* ;
import java.util.ArrayList;
public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        int cnt1=0,cnt2=0;
        int ele1=-1,ele2=-1;
        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2!=arr.get(i)){
                cnt1=1;
                ele1=arr.get(i);
            }
            else if(cnt2==0 && ele1!=arr.get(i)){
                cnt2=1;
                ele2=arr.get(i);
            }
            else if(ele1==arr.get(i))
            cnt1++;
            else if(ele2==arr.get(i))
            cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        
        int temp1=0;
        int temp2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==ele1)
            temp1++;
            if(arr.get(i)==ele2)
            temp2++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(temp1>n/3)
        ans.add(ele1);
        if(temp2>n/3)
        ans.add(ele2);
        return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(N)
SPACE COMPLEXITY:- O(1)
*/
