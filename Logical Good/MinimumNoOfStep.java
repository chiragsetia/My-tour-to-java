/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element.
The task is to find the minimum number of jumps to reach the end of the array (starting from the first element).
If an element is 0, then cannot move through that element.

Input: 
The first line contains an integer T, depicting total number of test cases.  Then following T lines contains a number n
denoting the size of the array. Next line contains the sequence of integers a1, a2, ..., an.

Output:
For each testcase, in a new line, print the minimum number of jumps. If answer is not possible print "-1"(without quotes).*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
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
	        System.out.println(help(arr,n));
	    }
	}
	static int help(int arr[], int n){
	    if(n==0||arr[0]==0){
	        return -1;
	    }
	    if(n<=1){
	        return 0;
	    }
	    int total=arr[0];
	    int c=1;
	    if(arr[0]!=1&&arr[0]<n){
	        for(int i=1;i<n&&i<=arr[0];i++){
	            if(arr[total]+total<=arr[i]+i){
	                total=i;
	            }
	        }
	    }
	   // System.out.print(arr[total]+" ");
	   // System.out.println(arr[total]+total);
	    while(total<n){
	        if(n-1<=total+arr[total]){
	           // System.out.println(arr[total]+" in loop");
	            c++;
	            break;
	        }
	        int step=arr[total];
	        int max=-1;
	        int k=-1;
	        for(int i=total+1;i<n&&i<=total+step;i++){
	            if(max+k<=arr[i]+i){
	                max=arr[i];
	                k=i;
	            }
	        }
	        if(k==-1||max==-1){
	            return -1;
	        }
	        total=k;
	       // System.out.print(arr[k]+" ");
	       // System.out.println(arr[k]+total);
	        c++;
	    }
	    return c;
	}
}
