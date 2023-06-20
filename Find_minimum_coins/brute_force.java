import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int ans=0;
        if(amount!=0){
        ans+=amount/1000;
        amount=amount%1000;
        }
        if(amount!=0){
            ans+=amount/500;
            amount=amount%500;
        }
        if(amount!=0){
            ans+=amount/100;
            amount=amount%100;
        }
        if(amount!=0){
            ans+=amount/50;
            amount=amount%50;
        }
        if(amount!=0){
            ans+=amount/20;
            amount=amount%20;
        }
        if(amount!=0){
            ans+=amount/10;
            amount=amount%10;
        }
        if(amount!=0){
            ans+=amount/5;
            amount=amount%5;
        }
        if(amount!=0){
            ans+=amount/2;
            amount=amount%2;
        }
        if(amount!=0){
            ans+=amount/1;
            amount=amount%1;
        }
        return ans;
    }
}

/*
HAHA CODE IS BIT LONG :) BUT YOU CAN OPTIMIZE THE CODE AS YOUR WISH
TIME COMPLEXITY:- O(1)
SPACE COMPLEXITY:- O(1)
*/
