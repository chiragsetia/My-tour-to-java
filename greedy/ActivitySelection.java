/*
Given N activities with their start and finish times. Select the maximum number 
of activities that can be performed by a single person, assuming that a person 
can only work on a single activity at a time.

Note : The start time and end time of two activities may coincide.

Input:
The first line contains T denoting the number of testcases. Then follows 
description of testcases. First line is N number of activities then second
line contains N numbers which are starting time of activies.Third line contains N finishing time of activities.

Output:
For each test case, output a single number denoting maximum activites which can be performed in new line.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class pair{
        int a;
        int b;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
	public static void main (String[] args)throws IOException{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            // n : size of array 
            int n = Integer.parseInt(br.readLine()); 
  
            // Declaring array 
            int arrS[] = new int[n]; 
            int arrF[]=new int[n];
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
                arrS[i] = Integer.parseInt(strs[i]); 
            
            line = br.readLine(); 
            strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) 
                arrF[i] = Integer.parseInt(strs[i]);
            pair arrP[]=new pair[n];
            for(int i=0;i<n;i++){
                arrP[i]=new pair(arrS[i],arrF[i]);
            }
            Arrays.sort(arrP,new Comparator<pair>(){
               public int compare(pair o1,pair o2){
                   if(o1.b==o2.b){
                       return o2.a-o1.a;
                   }
                   return o1.b-o2.b;
               }
            });
            // for(pair i:arrP){
            //     System.out.println(i.a+" "+i.b+" ");
            // }
            int c=1;
            int p=arrP[0].b;
            for(int i=1;i<n;i++){
                if(p<=arrP[i].a){
                    c++;
                    p=arrP[i].b;
                }
            }
            System.out.println(c);
        }
	}
