/*Given an input stream of N characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If no non repeating element is found print -1.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the stream. Then in the next line are x characters which are inserted to the stream.

Output:
For each test case in a new line print the first non repeating elements separated by spaces present in the stream at every instinct when a character is added to the stream, if no such element is present print -1.

Constraints:
1 <= T <= 200
1 <= N <= 500

Example:
Input:
2
4
a a b c
3
a a c

Output:
a -1 b b
a -1 c
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        help(sc);
	        System.out.println();
	    }
	}
	private static void help(Scanner sc){
	    HashMap<Character,Integer> set=new HashMap<>();
	    Queue<Character> q=new LinkedList<>();
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        char c=sc.next().charAt(0);
	        if(set.containsKey(c)){
	            set.put(c,2);
	            while(!q.isEmpty()&&set.get(q.peek())==2){
	                q.remove();
	            }
	            if(q.isEmpty()){
	                System.out.print("-1 ");
	            }else{
	                System.out.print(q.peek()+" ");
	            }
	        }else{
	            q.add(c);
	            set.put(c,1);
	            while(set.get(q.peek())==2){
	                q.remove();
	            }
	            System.out.print(q.peek()+" ");
	        }
	    }
	}
}
