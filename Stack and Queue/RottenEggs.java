/*
Given a matrix of dimension r*c where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell 
1 : Cells have fresh oranges 
2 : Cells have rotten oranges

So, we have to determine what is the minimum time required to all oranges. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. If it is impossible to rot every orange then simply return -1.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains two integers r and c, where r is the number of rows and c is the number of columns in the array a[]. Next line contains space separated r*c elements each in the array a[].

Output:
Print an integer which denotes the minimum time taken to rot all the oranges (-1 if it is impossible).

*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0){int n=sc.nextInt();
	    int m=sc.nextInt();
	    int arr[][]=new int[n][m];;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            arr[i][j]=sc.nextInt();
	        }
	    }
	       System.out.println(help(arr,m,n)) ; 
	    }
	    
	}
	static int help(int[][]arr,int m,int n){
	Queue<Pair> q=new LinkedList<>();
	int c=0;
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	        if(arr[i][j]==2){
	            q.add(new Pair(i,j));
	            c++;
	        }
	    }
	}
	int count=-1;
	while(!q.isEmpty()){
	    int f=0;
	    while(c--!=0){
	        Pair t=q.remove();
	        //System.out.print(t.i+" "+t.j+" ");
	        if(t.j>0 && arr[t.i][t.j-1]==1){
	            q.add(new Pair(t.i,t.j-1));
	            //System.out.print(t.i+" "+(t.j-1)+" ");
	            arr[t.i][t.j-1]=2;
	        }
	        if(t.i>0 && arr[t.i-1][t.j]==1){
	            q.add(new Pair(t.i-1,t.j));
	            arr[t.i-1][t.j]=2;
	             //System.out.print((t.i-1)+" "+t.j+" ");
	        }
	        
	        if(t.i<n-1 &&arr[t.i+1][t.j]==1){
	            q.add(new Pair(t.i+1,t.j));
	            arr[t.i+1][t.j]=2;
	             //System.out.print((t.i+1)+" "+t.j+" ");
	        }
	        
	        if(t.j<m-1 &&arr[t.i][t.j+1]==1){
	            q.add(new Pair(t.i,t.j+1));
	            arr[t.i][t.j+1]=2;
	             //System.out.print(t.i+" "+(t.j+1)+" ");
	        }
	        //System.out.println();
	    }
	    count++;
	    c=q.size();
	    //System.out.println("end");
	}
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	        if(arr[i][j]==1){
	            return -1;
	        }
	        }
	    }
	
	return count;
}
}
class Pair{
    int i,j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
