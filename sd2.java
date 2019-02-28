import java.util.*;
import java.lang.*;
class sd2
{
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int t=abc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=abc.nextInt();
			int k=abc.nextInt();
			long arr[][]=new long[k+1][n+1];
			for(int j=1;j<n+1;j++)
			{
				arr[1][j]=j*j-j;
			}
			long r=products(n,k,1,arr);
			for(int j=0;j<k+1;j++)
			{
				for(int l=0;l<n+1;l++)
				{
					System.out.print(arr[j][l]+" ");
				}
				System.out.println();
			}
			int ans=(int)(r%(1000000000+7));
			System.out.println(ans);
		}
	}
	public static long products(int n,int k,int c,long[][] arr)
	{
		if(c>n||n<0||k<1)
		{	
			return -1;
		}
		if(k==1&&c==n)
		{
		  	return arr[k][c];
		}
		long inc=products(n-c,k-1,c+1,arr);
		long ninc=products(n,k,c+1,arr);
		if(inc==-1)
		{
			arr[k][c]=ninc;
			return ninc; 
		}
		else
		{
			inc=inc*(long)(c*c-c);
			if(ninc==-1)
			{
				arr[k][c]=inc;
				return arr[k][c];
			}

			arr[k][c]=(Math.max(inc,ninc));
			return arr[k][c];
		}
	}
}
// 			int n=abc.nextInt();
// 			int m=abc.nextInt();
// 			int k=abc.nextInt();
// 			int l=abc.nextInt();
// 			int arr[]=new int[n];
// 			for(int j=0;j<n;j++)
// 				arr[j]=abc.nextInt();
// 			Arrays.sort(arr);
// 			int min=Integer.MAX_VALUE;
// 			for(int j=0;j<n;j++)
// 			{
// 				int c=l*(j+m+1)-arr[j];
// 				if(min>c)
// 					min=c;
// 			}
// 			if(min>(l*(m+n+1)-k))
// 				min=l*(m+n+1)-k;
// 			if(min<0)
// 				System.out.println("0");
// 			else
// 				System.out.println(min);
// 		}
// 	}
// }
// 		{
// 			int n=abc.nextInt();
// 			int k=abc.nextInt();
// 			ArrayList<ArrayList<ArrayList<Integer>>> thd=new ArrayList<ArrayList<ArrayList<Integer>>>();
// 			for(int j=0;j<k+1;j++)
// 			{
// 				thd.add(new ArrayList<ArrayList<Integer>>());
// 			}
// 			ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> abcz=new ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>>();
// 			for(int j=0;j<n+1;j++)
// 			{
// 				abcz.add(thd);
// 			}
// 			if(k==1)
// 			{
// 				System.out.println((n*n-n)%(1000000000+7));
// 			}
// 			if(n==1&&k>1)
// 				System.out.println("-1");
// 			ArrayList<ArrayList<Integer>> al=list(n,k,1,abcz);
// 			if(al==null)
// 				System.out.println("-1");

// 			long ans=0;
// 			for(ArrayList<Integer>j:al)
// 				{
// 					long p=1;
// 					for(int m=0;m<k;m++)
// 					{
// 						int temp=j.get(m);
// 						p=p*(long)(temp*temp-temp);
// 					}
// 					if(ans<p)
// 						ans=p;
// 				}
// 				System.out.println((ans%(1000000000+7)));		
// 		}
// 	}
// 	public static ArrayList<ArrayList<Integer>> list(int n,int k,int c,ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> ll)
// 	{
// 		if(c>n||n<0)
// 			return null;
// 		if(ll.get(n).get(k).size()!=0)
// 			return ll.get(n).get(k);
// 		if(n==c&&k==1)
// 		{
// 			ArrayList<Integer> abc=new ArrayList<Integer>();
// 			abc.add(c);
// 			ArrayList<ArrayList<Integer>> abc1=new ArrayList<ArrayList<Integer>>();
// 			abc1.add(abc);
// 			ArrayList<ArrayList<ArrayList<Integer>>> abc2=new ArrayList<ArrayList<ArrayList<Integer>>>();
// 			abc2.add(k,abc1);
// 			ll.add(n,abc2);
// 			return abc1;

// 		}
// 		ArrayList<ArrayList<Integer>> inc=list(n-c,k-1,c+1,ll);
// 		ArrayList<ArrayList<Integer>> ninc=list(n,k,c+1,ll);
// 		if(inc==null)
// 			{	
// 				ArrayList<ArrayList<ArrayList<Integer>>> abc2=new ArrayList<ArrayList<ArrayList<Integer>>>();
// 				abc2.add(k,ninc);
// 				ll.add(n,abc2);
// 				return ninc;
// 			}
// 		else
// 		{
// 			for(ArrayList<Integer> i:inc)
// 			{
// 				i.add(c);
// 			}
// 			if(ninc==null)

// 				{
// 					ArrayList<ArrayList<ArrayList<Integer>>> abc2=new ArrayList<ArrayList<ArrayList<Integer>>>();
// 					abc2.add(k,inc);
// 					ll.add(n,abc2);
// 					return inc;
// 				}
// 			else
// 			{
// 				ArrayList<ArrayList<Integer>> abc1=new ArrayList<ArrayList<Integer>>();
// 				for(ArrayList<Integer> i:inc)
// 				{
// 					abc1.add(i);
// 				}
// 				for(ArrayList<Integer> i:ninc)
// 				{
// 					abc1.add(i);
// 				}
// 				ArrayList<ArrayList<ArrayList<Integer>>> abc2=new ArrayList<ArrayList<ArrayList<Integer>>>();
// 				abc2.add(k,abc1);
// 				ll.add(n,abc2);
// 				return abc1;
// 			}
// 		}
// 	}
// }