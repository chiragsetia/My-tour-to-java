import java.util.*;

class GFG {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	for(int j=0;j<t;j++){
        	int n=sc.nextInt();
        	int arr[]=new int[n];
        	for (int i=0;i<n ;i++ ) {
        		arr[i]=sc.nextInt();
        	}
        	//int s=firstNonZero(arr);
        	//System.out.println(water(arr,s));
        	help(arr,n);
    	}
    }
    private static void help(int []arr,int n){
        int flag=0;
        int check=0;
        int minIndex=0;
        int maxIndex=-1;
        for(int i=1;i<n;i++){
            if(flag==0&&arr[i]<arr[minIndex]){
                minIndex=i;
                //System.out.println("1");
            }
            else if(flag==0&&arr[i]>arr[minIndex]){
                flag=1;
                maxIndex=i;
                //System.out.println("2");
            }
            else if(flag==1&&arr[i]>arr[maxIndex]){
                maxIndex=i;
                //System.out.println("3");
            }else if(flag==1&&arr[i]<arr[maxIndex]){
                System.out.print("("+minIndex+" "+maxIndex+")");
                minIndex=i;
                flag=0;
                check++;
                //System.out.println("4");
            }
        }
        if(maxIndex==n-1){
        	System.out.print("("+minIndex+" "+maxIndex+")");
        }
        if(check==0){
            System.out.println("No Profit");
        }else{
            System.out.println();
        }
    }
}