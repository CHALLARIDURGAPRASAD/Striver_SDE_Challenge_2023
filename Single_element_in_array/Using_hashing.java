import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return 1;
    }
}
/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
