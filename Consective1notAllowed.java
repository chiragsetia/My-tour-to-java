/*
Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.
Output your answer mod 10^9 + 7.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case contain an integer N representing length of the binary string.

Output:
Print the count number of binary strings without consecutive 1’s of length N.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100


*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		long fact[]=new long[100];
		fact[0]=2L;
		fact[1]=3L;
		for(int i=2;i<100;i++){
		    fact[i]=fact[i-1]+fact[i-2];
		    fact[i]=fact[i]%1000000007;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    System.out.println(fact[n-1]);
		}
	}
}
