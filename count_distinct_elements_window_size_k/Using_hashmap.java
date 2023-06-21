import java.util.* ;
public class Solution {
	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
		// Write your code here
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
		}
		ans.add(map.size());
		int j=0;
		for(int i=k;i<arr.size();i++){
			if(map.containsKey(arr.get(j)) && map.get(arr.get(j))==1)
			map.remove(arr.get(j));
			else if(map.containsKey(arr.get(j)) && map.get(arr.get(j))!=1){
				int val=map.get(arr.get(j));
				val--;
				map.put(arr.get(j),val);
			}
			map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
			ans.add(map.size());
			j++;
		}
		return ans;
	}
}

/*
TIME COMPLEXITY:- O(N)
SPACE COMPLEXITY:- O(N)
*/
