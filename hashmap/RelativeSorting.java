/*
Given two arrays A1[] and A2[] of size N and M respectively. 
The task is to sort A1 in such a way that the relative order 
among the elements will be same as those in A2. For the elements
not present in A2, append them at last in sorted order. It 
is also given that the number of elements in A2[] are smaller
than or equal to number of elements in A1[] and A2[] has all distinct elements.

Note: Expected time complexity is O(N log(N)).

Input:
First line of input contains number of testcases. For each testcase,
first line of input contains length of arrays N and M and next two line contains N and M elements respectively.
*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG  implements Comparator<Integer>{
    static HashMap<Integer,Integer> map;
    public int compare(Integer m1,Integer m) 
    { 
        int a=m1.intValue();
        int b=m.intValue();
        if(map.containsKey(a)&&map.containsKey(b)){
            return map.get(a)-map.get(b);
        }else if(map.containsKey(a)){
            return -1;
        }else if(map.containsKey(b)){
            return 1;
        }else{
         return a-b;   
        }
    }
	public static void main (String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        map=new HashMap<>();
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        ArrayList<Integer> list =new ArrayList<>();
	        for(int i=0;i<n;i++){
	            list.add(sc.nextInt());
	        }
	        for(int i=0;i<k;i++){
	            map.put(sc.nextInt(),i);
	        }
	        Collections.sort(list,new GFG());
	        for(Integer i:list){
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	    
	}
}
