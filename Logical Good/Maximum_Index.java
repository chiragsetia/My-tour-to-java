/*
Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].

Input:
The first line contains an integer T, depicting total number of test cases.  Then T test case follows. First line of each test case contains an integer N denoting the size of the array. Next line contains N space separated integeres denoting the elements of the array.

Output:
Print the maximum difference of the indexes i and j in a separtate line.
*/


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            // n : size of array 
            int n = Integer.parseInt(br.readLine()); 
  
            // Declaring array 
            int arr[] = new int[n]; 
  
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
                arr[i] = Integer.parseInt(strs[i]); 
            System.out.println(diff(arr,n));
        }
	}
	public static int diff(int[]arr, int n){
	    if(n==1){
	        return 0; 
	    }
	    int leftMin[]=new int[n];
	    int rightMax[]=new int[n];
	    leftMin[0]=arr[0];
	    for(int i=1;i<n;i++){
	        leftMin[i]=Math.min(leftMin[i-1],arr[i]);
	    }
	    rightMax[n-1]=arr[n-1];
	    for(int i=n-2;i>=0;i--){
	        rightMax[i]=Math.max(rightMax[i+1],arr[i]);
	    }
	    int i=0;int j=0;
	    int diff=-1;
	    while(i<n&&j<n){
	        if(leftMin[i]<=rightMax[j]){
	            diff=Math.max(diff,j-i);
	            j++;
	        }else{
	            i++;
	        }
	    }
	    return diff;
	}
}
