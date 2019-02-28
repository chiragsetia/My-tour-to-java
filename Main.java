import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		while(test-- > 0){
			int n=in.nextInt();
			System.out.println(helper(in,n));
		}
	}
	static String helper(Scanner in,int n){
        //int t=n;
        int f=0;
        for(int i=2;i<=n;i+=2){
        	int t1=in.nextInt();
        	int t2=in.nextInt();
        	if(t1>=i||t2>i){
        		f=1;
        	}
        }
        	if(n%2!=0)
        		in.nextInt();
        	if(f==0)
        	return("Yes");
        	else
        		return ("No");
   	}
}
        //int n=in.nextInt();
      //   int flag=0;
      //   int t=in.nextInt();
      //   if(t==0){
      //       flag=1;
      //   }
      //   for(int i=1;i<n;i++){
      //       int next=in.nextInt();
      //       if(flag==1){
      //           if(i==next)
      //           continue;
      //            t=next;
      //           if(t!=i){
      //               flag=0;
      //           }
      //       }else if(flag==0){
 	    //            if(t-next>1){
						// return "No";
      //              }
      //           if(t==i){
      //       		flag=1;
      //   		}
      //       }
      //   }
      //   return "Yes";