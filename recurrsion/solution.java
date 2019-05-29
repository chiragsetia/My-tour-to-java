/*Min Steps to one
Level EASY
Given a positive integer n, find the minimum number of steps s, that takes n to 1. You can perform any one of the following 3 steps.
1.) Subtract 1 from it. (n= n - ­1) ,
2.) If its divisible by 2, divide by 2.( if n%2==0, then n= n/2 ) ,
3.) If its divisible by 3, divide by 3. (if n%3 == 0, then n = n / 3 ).  */




public class Solution {
	
	public static int countStepsTo1(int n){
        if(n==1){
            return 0;
        }
        int a=1+countStepsTo1(n-1);
        if(n%2==0){
            a=Math.min(a,1+countStepsTo1(n/2));
        }
        if(n%3==0){
            a=Math.min(a,1+countStepsTo1(n/3));
        }
        return a;
	}
	
}
