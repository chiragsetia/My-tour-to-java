

//next smaller element

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		help(arr,n);
		}
	}
	static void help(int []arr,int n){
	    Stack<Integer> s=new Stack<>();
	    HashMap<Integer,Integer> map=new HashMap<>();
	    s.push(arr[0]);
	    for(int i=1;i<n;i++){
	        int next=arr[i];
	        if(!s.isEmpty()){
	            int element=s.pop();
	            while(element>next){
	                map.put(element,next);
	                if(s.isEmpty()){
	                    break;
	                }
	                element=s.pop();
	            }
	            if(element<next){
	            s.push(element);
	            //System.out.println(element);
	        }
	   }
	   s.push(next);
	}
	while(!s.isEmpty()){
	    map.put(s.pop(),-1);
	}
	for(int i=0;i<n;i++){
	    System.out.print(map.get(arr[i])+" ");
	}
	System.out.println();
}
}
