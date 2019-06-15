public class Solution {
  public static int countStepsTo1(int n){
    int steps[] = new int[n + 1];				
    for(int i = 2; i <= n; i++)
    {	
      int count1,count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE;
      count1 = steps[i - 1];
      if(i % 2 == 0){
        count2 = steps[i / 2];
      }
      if(i % 3 == 0){
        count3 = steps[i / 3];
      }
    steps[i] =  1 + Math.min(count1, Math.min(count2, count3));
    }
    return steps[n];
   }
}

//OR Another way that we will come in reverse direction and check for three elements prv, current and from which we are coming

public class Solution {
	
	public static int countStepsTo1(int n){
		
	int arr[] = new int[n + 1]; 
    for (int i = 1; i <= n; i++) 
        arr[i] = n-i; 
    for (int i = n; i>=1; i--) {
        if(i%2==0){
            arr[i/2]=Math.min(arr[i/2],Math.min(arr[i]+1,arr[i/2+1]+1));
        }
        if(i%3==0){
            arr[i/3]=Math.min(arr[i/3],Math.min(arr[i]+1,arr[i/3+1]+1));
        }
    } 
    return arr[1];
	}
	
}
