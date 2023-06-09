import java.io.*;
import java.util.* ;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        int n=arr.size();
        Set<Integer> dummy=new HashSet<>();
        for(int i=0;i<arr.size();i++){
            int cnt=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==arr.get(i))
                cnt++;
            }
            if(cnt>n/3)
            dummy.add(arr.get(i));
        }
        return new ArrayList<>(dummy);
    }
}
/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(N)
*/
