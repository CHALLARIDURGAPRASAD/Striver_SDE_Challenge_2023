import java.util.*;
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        HashSet<Node> set=new HashSet<>();
        Node temp=firstHead;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=secondHead;
        while(temp!=null){
            if(set.contains(temp))
            return temp.data;
            temp=temp.next;
        }
        return 0;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(N)
SPACE COMPLEXITY:- O(N)
*/
