/*Given an array having both positive an negative integers. 
The task is to complete the function maxLen() which returns
the length of maximum subarray with 0 sum. The function
takes two arguments an array A and n where n is the size of the array A.

Input:
The first line of input contains an element T denoting the number of test cases.
Then T test cases follow. Each test case consist of 2 lines. 
The first line of each test case contains a number denoting the size of the array A. 
Then in the next line are space separated values of the array A.

Output:
For each test case output will be the length of the largest subarray which has sum 0.

*/
class GfG
{
    int maxLen(int arr[], int n)
    {
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                if(max<i-map.get(sum))
                    max=i-map.get(sum);
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
