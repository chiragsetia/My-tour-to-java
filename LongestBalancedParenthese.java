/*
Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

Input:
First line contains number of test cases T.  Each test case have one line string S of character '(' and ')' of length  N.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            String line = br.readLine();
            Stack<Integer> s=new Stack<>();
            s.push(-1);
            int max=-1;
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)=='('){
                        s.push(i);
                }else{
                    s.pop();
                    if(s.isEmpty()==false){
                        max=Math.max(i-s.peek(),max);
                    }else{
                        s.push(i);
                    }
                }
            }
            System.out.println(max);
        }
	}
}
