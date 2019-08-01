/*
given n and c calculate ncr
*/


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int r=sc.nextInt();
		    int arr[][]=new int[n+1][r+1];
		    for(int i=0;i<n+1;i++){
		        arr[i][0]=1;
		        if(i<=r)
		            arr[i][i]=1;
		    }
		    for(int i=2;i<n+1;i++){
		        for(int j=1;j<i&&j<=r;j++){
		            arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		        }
		    }
		    System.out.println(arr[n][r]);
		}
	}
}
