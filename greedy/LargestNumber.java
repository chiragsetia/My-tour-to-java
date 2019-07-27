
*//*
Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N'
digits and whose sum of digits should be equals to 'S'.
 

Input

The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. The first line of each test case contains two space 
separated integers N and S, where N is the number of digits and S is the sum.
 

Output

Print the largest number that is possible.
If their is no such number, then print -1 
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException{
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            // n : size of array 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            int n = Integer.parseInt(strs[0]); 
            int s = Integer.parseInt(strs[1]);
            if(s==0||n==0||n*9<s){
                 System.out.println("-1");
                 continue;
            }
            String str="";
            while(n!=0){
                n--;
                if(s>9){
                    s=s-9;
                    str+="9";
                }else{
                    str+=Integer.toString(s);
                    s=0;
                }
            }
            if(s!=0){
                System.out.println("-1");
            }else{
                System.out.println(str);
            }
        }
	}
}
