/*
Given an array of positive integers of size N, we can form a group of two or three only, the group should be such that 
the sum of all elements in that group is a multiple of 3. Count all possible number of groups that can be generated in
this way.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N,
where N is the size of array. The second line of each test case contains N elements of array.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException 
    { 
  
        // Using BufferedReader class to take input 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            // n : size of array 
            int n = Integer.parseInt(br.readLine()); 
  
            // Declaring array 
            int arr[] = new int[3]; 
  
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
                arr[Integer.parseInt(strs[i])%3]++;
            long sum=fact(arr[0],2)+fact(arr[1],1)*fact(arr[2],1)*(1+fact(arr[0],1))+fact(arr[0],3)+fact(arr[1],3)+fact(arr[2],3);
            System.out.println(sum);
        }
	}
	static long fact(long n,int r){
	    if(n<r||n==0){
	        return 0L;
	    }
	    if(r==3){
	        return (long)(n*(n-1L)*(n-2L)/6);
	    }
	    if(r==1){
	        return (long)n;
	    }
	    if(r==2){
	        return (long)(n*(n-1L)/2);
	    }
	    return 0L;
	}
}
