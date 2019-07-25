/*
You are given an array A of size N. You need to print the total count of sub-arrays having their sum equal to 0

Input:
First line of the input contains an integer T denoting the number of test cases.
Each test case consists of two lines. First line of each test case contains an 
Integer N denoting the size of the array, and the second line contains N space separated integers.

Output: 
For each test case, in a new line, print the total number of subarrays whose sum is equal to 0.
*/

class GfG
{
    void countDistinct(int A[], int k, int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(;i<k;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        int j=0;
        for(;i<n;i++){
            System.out.print(map.size()+" ");
            map.put(A[j],map.get(A[j])-1);
            if(map.get(A[j])==0){
                map.remove(A[j]);
            }
            j++;
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        System.out.print(map.size());
    }
}
