/*Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.

Input:
The first line of input contains an integer T denoting the number of test cases. 
The first line of each test case contains a single integer N denoting the size
of array and the size of subarray K. The second line contains N space-separated
integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum for every subarray of size k.

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0){
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int arr[]=new int[n];
	        Deque<Integer> q=new LinkedList<>();
	        for(int j=0;j<n;j++){
	            arr[j]=sc.nextInt();
	        }
	        int i=0;
	        for(;i<k;i++){
	            while(!q.isEmpty()&&arr[i]<=arr[q.peekLast()]){
	                q.removeLast();
	            }
	            q.addLast(i);
	        }
	        for(;i<n;i++){
	            System.out.print(arr[q.peek()]+" ");
	            while(!q.isEmpty()&&q.peek()<=i-k){
	                q.remove();
	            }
	            while(!q.isEmpty()&&arr[i]<=arr[q.peekLast()]){
	                q.removeLast();
	            }
	            q.addLast(i);
	        }
	        System.out.println(arr[q.peek()]);
	    }
	}
}
