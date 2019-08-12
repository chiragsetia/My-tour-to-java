/*
In a candy store there are N different types of candies available  and the prices of all the N different types of
candies are provided to you.
You are now provided with an attractive offer.
You can buy a single candy from the store and get atmost K other candies ( all are different types ) for free.
Now you have to answer two questions. Firstly, you have to tell what is the minimum amount of money you have to
spend to buy all the N different candies. Secondly, you have to tell what is the maximum amount of money you have
to spend to buy all the N different candies.
In both the cases you must utilize the offer i.e. you buy one candy and get K other candies for free.*/
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
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            int n = Integer.parseInt(strs[0]);
            int k=Integer.parseInt(strs[1]);
  
            // Declaring array 
            int arr[] = new int[n]; 
  
            // to read multiple integers line 
            line = br.readLine(); 
            strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
                arr[i] = Integer.parseInt(strs[i]); 
            
            Arrays.sort(arr);
            int temp=0;
            int min=0;
            int max=0;
            int i=0;
            int j=n-1;
            while(temp<n){
                min+=arr[i];
                i++;
                max+=arr[j];
                j--;
                temp+=1+k;
            }
            System.out.println(min+" "+max);
        }
	}
}
