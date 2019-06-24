/*
Find the first circular tour that visits all petrol pumps
Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.

Calculate the first point from where a truck will be able to complete the circle 
(The truck will stop at each petrol pump and it has infinite capacity).
Expected time complexity is O(n). Assume for 1 litre petrol, the truck can go 1 unit of distance.

For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump
value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where truck can make a circular 
tour is 2nd petrol pump. Output should be “start = 1” (index of 2nd petrol pump).
*/

class solution
{
    int tour(int petrol[], int distance[])
    {
	// Your code here
	int sum=0,sumAll=0;;
	int t=-1;
	int flag=0;
	for(int i=0;i<petrol.length;i++)
	  {
	      sumAll+=petrol[i]-distance[i];
	      sum+=(petrol[i]-distance[i]);
	 if(sum<0){
	     flag=0;
	 }
	 if(flag==0&&petrol[i]>distance[i]) 
	 {
	     flag=1;
	     t=i;
	     sum=petrol[i]-distance[i];
	 }
	  }
	  if(sumAll<0){
	      return -1;
	  }
	  return t;
    }
}
