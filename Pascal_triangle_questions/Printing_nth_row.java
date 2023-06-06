import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=1;
    System.out.print(ans);
    for(int i=1;i<n;i++){
      ans=ans*(n-i);
      ans=ans/i;
      System.out.print(ans+" ");
    }
    System.out.print(1);
  }
}

/*
TIME COMPLEXITY:- o(n)
SPACE COMPLEXITY:- O(1)
*/
