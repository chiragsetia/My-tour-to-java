/*
Interview Shuriken 19: Maximum Subarray Sum
Level MEDIUM
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.
Follow up: Do this in O(N) time.
Input Format:
The first line of input contains size of array, which is denoted by N and second line of input contains N space separated integers.
Output Format:
The first and only line of output should print the maximum subarray sum, as described in the description.*/

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=Math.max(0,sc.nextInt());
        int max=arr[0];
        for(int i=1;i<n;i++){
            int t=sc.nextInt();
            arr[i]=Math.max(arr[i-1]+t,0);
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

	}

}
