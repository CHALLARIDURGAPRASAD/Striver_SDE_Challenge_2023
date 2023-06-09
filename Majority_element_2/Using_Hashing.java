import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/3)
            ans.add(entry.getKey());
        }
        return ans;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(N)
SPACE COMPLEXITY:- O(N)
*/
