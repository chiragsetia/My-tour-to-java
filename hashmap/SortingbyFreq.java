/*
Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
*/


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG implements Comparator<Integer> {
static HashMap<Integer,Integer> map;
public int compare(Integer m1,Integer m) 
{ 
int a=map.get(m1);
int b=map.get(m);
if(a==b){
return m1-m;
}else{
return b-a;
}
}
public static void main (String[] args) {
Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
map=new HashMap<>();
ArrayList<Integer> list =new ArrayList<>();
for(int i=0;i<n;i++){
list.add(sc.nextInt());
if(map.containsKey(list.get(i))){
map.put(list.get(i),map.get(list.get(i))+1);
}else{
map.put(list.get(i),1);    
}
}
Collections.sort(list,new GFG());
for(Integer i:list){
System.out.print(i+" ");
}
System.out.println();
}
}
}
