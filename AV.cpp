#include<iostream>
#include<stdio.h>
using namespace std;




void MERGESORT(int arr[],int l, int mid,int r )
{
	int nl=mid-l+1;
	int nr=r-mid;
	int left[nl],right[nr];
	for(int i=0;i<nl;i++)
	 left[i]=arr[l+i];
	for(int j=0;j<nr;j++)
	 right[j]=arr[mid+1+j];
	int i=0,j=0; int k=1;
	while(i<nl && j<nr)	
	{
		if(left[i]<=right[j])
		 {
		 arr[k]=left[i];
		 i++;  }
		else
		{
			arr[k]=right[j];
			j++;  
		} 
		k++;
	}
	while(i<nl)
		{
			arr[k]=left[i];
			i++; k++;
		}
	while(j<nr)
		{
			arr[k]=left[j];
			j++; k++;
		}
}
void MERGE(int arr[],int l, int r)
{  

	if(l<r)
	{
		int mid=(l+r)/2; 
		MERGE(arr,l,mid);
		MERGE(arr,mid+1,r);
		MERGESORT(arr,l,mid,r);
	}
}


int main()
{ 
	int n=10;          
	int arr[n];            
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}

	cout<<endl;
	MERGE(arr,0,n-1);  
	for(int i=0;i<n;i++)
	cout<<arr[i]<<" ";
	return 0;
}