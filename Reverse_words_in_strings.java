import java.util.*;
public class Solution 
{
	public static String reverseString(String str) 
	{
	 String str1[]=str.split(" ");
	 String ans="";
	 for(int i=str1.length-1;i>=0;i--){
	 ans+=str1[i];
	 ans+=" ";
	 }
	 return ans;	
	}
}

/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
