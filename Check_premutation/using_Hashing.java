import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        for(int i=0;i<str2.length();i++)
        map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        boolean flag=true;
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(map2.containsKey(entry.getKey()) && map2.get(entry.getKey())==entry.getValue())
            continue;
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(N)+O(N)
SPACE COMPLEXITY:- O(N)+O(N)
  */
