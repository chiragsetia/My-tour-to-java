/*
Given a positive number X. Find all Jumping Numbers smaller than or equal to X. 
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1.
All single digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are 
Jumping numbers but 796 and 89098 are not.

Input:
The first line of the input contains T denoting the number of testcases. Each testcase contain a positive number X.*/

//It can be done using queue
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static List<Integer> list;
	public static void main (String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    list=new ArrayList<>();
	    List<Integer> input=new ArrayList<>();
	    int max=0;
	    while(t-->0){
	        String s=br.readLine();
	        int n=Integer.parseInt(s);
	        if(n>max){
	            max=n;
	        }
	        input.add(n);
	    }
	    list.add(0);
	    for(int i=1;i<=9;i++){
	        help(max,i);
	    }
	    Collections.sort(list);
	    for(Integer i:input){
	        for(Integer j:list){
	            if(j>i){
	                break;
	            }
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
	}
	static void help(int max, int i){
	    if(i>max){
	        return ;
	    }
	    list.add(i);
	    int k=i%10;
	    if(k!=0){
	        help(max,i*10+k-1);
	    }
	    if(k!=9){
	        help(max,i*10+k+1);
	    }
	}
}
