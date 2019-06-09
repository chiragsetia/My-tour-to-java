/*Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".*/


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        String s=sc.next();
        if(s==""){
            return;
            //System.out.println("yes");
        }
        int arr[]=new int[2];
        if(o==1){
            encoding(s);
        }else if(o==2){
//               arr[s.length()]=1;
            decoding(s);
        }
 }
        private static void encoding(String s){
        String output="";
        char t=s.charAt(0);
        int c=1;
        for (int i=1;i<s.length();i++ ) {
            if(t==s.charAt(i)){
                c++;
            }else{
                output+=Integer.toString(c)+t;
                c=1;
                t=s.charAt(i);
            }
        }
        output+=Integer.toString(c)+t;
        System.out.println(output);
    }
     private static void decoding(String s){
        String output="";
        for(int i=0;i<s.length();){
            int sum=0;
            int c=s.charAt(i)-'0';
            while(0<=c && c<10){
                sum=sum*10+c;
                i++;
                c=s.charAt(i)-'0';
            }
            //char t=s.charAt(i+1);
            for (int j=0;j<sum;j++) {
                output+=s.charAt(i);
            }
            i++;
        }
        System.out.println(output);
     }

}



//his problem was asked by Google.
/*Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.
Follow Up: Do this in linear time and in-place.
For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].*/


public class Solution {
	static void sortRGB(char[] arr) {
		//Your code goes here
       	int i=0;
        int j=arr.length-1;
        for(int k=j;k>=0;k--){
            if(arr[k]=='B'){
                 char t=arr[j];
                arr[j]=arr[k];
                arr[k]=t;
                j--;
            }
        }
        for(int k=0;k<=j;k++){
            if(arr[k]=='R'){
                char t=arr[i];
                arr[i]=arr[k];
                arr[k]=t;
                i++;
            }
        }
	}
}

//or we can do it by R to starting, g as it is and b to last but not update k




/*Ancestors
Level MEDIUM
Given a binary tree with N number of nodes and a node K, you need to find and return a list of all ancestors of the given node K.
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
Line 2 : Node K
Output format :
A list of all ancestors
Constraints :
1 <= N <= 10^5
Sample Input :
1 2 3 4 5 -1 7 -1 -1 6 -1 8 -1 -1 -1 -1 -1
6
Sample Output :
1
2
5*/

import java.util.*;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static ArrayList<Integer> ancestors(BinaryTreeNode<Integer> root, int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return the output, don't print it.
		*/
        if(root==null){
            return null;
        }
        if(root.data==k){
            ArrayList<Integer> list =new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list=ancestors(root.left,k);
        if(list!=null){
            list.add(0,root.data);
            return list;
        }
        list=ancestors(root.right,k);
        if(list==null){
            return null;
        }
        list.add(0,root.data);
        return list;
	}
	
}
