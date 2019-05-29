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



/*Lexicographical Order
Level HARD
Given a number n, print numbers from 1 to n in dictionary(lexicographical) order.*/

import java.util.*;
public class Solution {

	public static void lexicographicalOrder(int num){
        for(int i=1;i<=9;i++){
            lex(i,num);
        }
    }
    private static void lex(int i, int num){
        if(i>num){
            return;
        }
       System.out.println(i);
        for(int j=0;j<10;j++){
            lex(i*10+j,num);
        }
    }

}
*Find Floor value
Level EASY
Given a sorted array A and an integer x, floor value of x is the largest element in the array which is smaller than or equal to x. You need to write an efficient function to find floor value of x.
*/

public class solution {
	public static int findFloor(int[] array, int element){
        return helper(array, element,array.length-1);
	}
    private static int helper(int []arr,int e,int l){
        if(l==-1){
            return l;
        }
        if(arr[l]<=e){
            return arr[l];
        }else{
            return helper(arr,e,l-1);
        }
    }
}

/*Count Inversions
Level MEDIUM
Let A[0 ... n-1] be an array of n distinct positive integers. If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A (where i and j are indexes of A). Given an integer array A, your task is to find the number of inversions in A.
*/

public class solution {
	
	long solve(int[] A,int n){
        return sort(A,0,n-1);
	}
	long merge(int arr[], int l, int m, int r) 
    { 
        long a=0;
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a+=n1-i;
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { //a++;
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        return a;
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    long sort(int arr[], int l, int r) 
    { 
        long a=0;
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            a= sort(arr, l, m); 
            a+=sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            a+=merge(arr, l, m, r); 
        }
     return a;   
    } 
}
