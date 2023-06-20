
public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        n=n/2;
        temp=head;
        for(int i=0;i<n;i++){
         temp=temp.next;
        }
        return temp;
    }
}
/*
TIME COMPLEXITY:- O(N)+O(K)
SPACE COMPLEXITY:- O(1);
*/
