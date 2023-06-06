/*  In this code i am thinking constraints are small which will work for "int"  you can take "long" if inputs are big */

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    int ans=1;
    for(int i=0;i<c;i++){
      res=res*(n-i);
      res=res/i+1;
    }
    System.out.println(ans);
  }
}
/*
TIME COMPLEXITY:-O(C)
SPACE COMPLEXITY:- O(1)
*/
