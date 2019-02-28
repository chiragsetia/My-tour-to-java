import java.util.*;

class smackdown
{
	
	
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		
		//	byte check[][]=new byte[50][50];
		int n=abc.nextInt();
	  	for(int i=0;i<n;i++)
	  	{
	 	  	int r=abc.nextInt();
	 	  	int c=abc.nextInt();
	 	  	int a[][]=new int[r][c];
	 	  	for(int j=0;j<r;j++)
	 	  	{
	 	  		String t=abc.next();
	 	  		for (int k=0;k<c;k++)
	 	  		{
	 	  			a[j][k]=(int)t.charAt(k)-(int)'0';

	 	  		}
	 	  	}
	 	  	//System.out.println("me");
	 	  	for(int l=1;l<=r+c-2;l++)
	 	  	{
	 	  		int cf=0;
	 	  		int vis[][]=new int[r][c];
	 	  		for(int j=0;j<r;j++)
	 	  		{
	 	  			for (int k=0;k<c;k++)
	 	  			{
	 	  				if(a[j][k]==0)
	 	  					continue;
	 	  				for(int m=0;m<=l;m++)
	 	  				{
	 	  					if(j-m>-1)
	 	  					{
	 	  						if(k-(l-m)>=0&&vis[j-m][k-l+m]==0&&a[j-m][k-l+m]==1)
	 	  						{
	 	  							//System.out.println("me2");
	 	  							cf++;
	 	  							vis[j-m][k-l+m]=1;
	 	  						}
	 	  						if(k+l-m<c&&vis[j-m][k+l-m]==0&&a[j-m][k+l-m]==1)
	 	  						{
	 	  							//System.out.println("me3");
	 	  							cf++;
	 	  							vis[j-m][k+l-m]=1;
	 	  						}	
	 	  					}
	 	  					if(j+m<r)
	 	  					{
	 	  						if(k-(l-m)>=0&&vis[j+m][k-l+m]==0&&a[j+m][k-l+m]==1)
	 	  						{
	 	  							cf++;
	 	  							vis[j+m][k-l+m]=1;
	 	  						}
	 	  						if(k+l-m<c&&vis[j+m][k+l-m]==0&&a[j+m][k+l-m]==1)
	 	  						{
	 	  							cf++;
	 	  							vis[j+m][k+l-m]=1;
	 	  						}	
	 	  					}
	 	  				}
	 	  				vis[j][k]=1;
	 	  			}
	 	  		}
	 	  		System.out.print(cf+" ");
	 	  	}

	 	}
	 }
	//  	  	int[]a=new int[size];
	//  	  	for(int j=0;j<size;j++)
	//  	  	{	
	//  	  		a[j]=abc.nextInt();
	//  	  	}
	//  	  	int vis[]=new int[size];
	//  	  	vis[0]=1;
	//  	  	for(int j=0;j<size;j++)
	//  	  	{
	//  	  		for(int k=j+1;k<size;k++)
	//  	  		{
	//  	  			if(vis[k]==1)
	//  	  				continue;
	//  	  			if(a[j]%2==0&&a[k]%2==0)
	//  	  				continue;
	//  	  			if(hcf(a[j],a[k],check)==1)
	//  	  			{
	//  	  				vis[k]=1;
	//  	 			}
	//  	  		}
	//  	  	}
	//  	  	int update=0;
	//  	  	//int to=0;
	//  	  	while(true)
	//  	  	{
	//  	  	int flag=0;
	//  	  	int c=0;
	//  	  	int max_value=0;
	//  	  	//int max_c=0;
	//  	  	for(int j=2;j<=50;j++)
	//  	  	{
	//  	  		int temp=0;
	//  	  		for(int k=0;k<size;k++)
	//  	  		{
	//  	  			if(vis[k]==1)
	//  	  				continue;
	//  	  			if(hcf(j,a[k],check)==1)
	//  	  				temp++;
	//  	  		}
	//  	  		if(temp>c)
	//  	  		{
	//  	  			c=temp;
	//  	  			max_value=j;
	//  	  		}
	//  	  	}
	//  	  	for(int j=0;j<size;j++)
	//  	  	{
	//  	  		if(vis[j]==0)
	//  	  		{	
	//  	  			update++;
	//  	  			flag=1;
	//  	  			vis[j]=1;
	//  	  			a[j]=max_value;
	//  	  			break;
	//  	  		}
	//  	  	}
	//  	  	for(int k=0;k<size;k++)
	//  	  		{
	//  	  			if(vis[k]==1)
	//  	  				continue;
	//  	  			if(hcf(max_value,a[k],check)==1)
	//  	  			{
	//  	  				vis[k]=1;
	//  	 			}
	//  	  		}
	//  	  		if(flag==0)
	//  	  			break;
	//  	  	}
	//  	  	System.out.println(update);
	//  	  	for(int j=0;j<size;j++)
	//  	  	{
	//  	  		System.out.print(a[j]+" ");
	//  	  	}

	//  	}
	// }
	// static int hcf(int a,int b,byte check[][])
	// 	{
	// 		if(check[a][b]!=0)
	// 			return check[a][b];
	// 		while(b!=0)
	// 		{
	// 			int t=b;
	// 			b=a%b;
	// 			a=t;
	// 		}
	// 		check[a][b]=(byte)a;
	// 		check[b][a]=(byte)a;
	// 		return a;
	// 	}
	 	//   	int sum=0;
	 	//   	HashMap<String,Integer> map=new HashMap<>();
			// for(int j=0;j<size;j++)
			// {
			// 	int t=0;
			// 	String temp=abc.next();
			// 	if(map.containsKey(temp))
			// 		t=map.get(temp)/2;
			// 	else{
			// 		int flag=0;
			// 		t=t+2;
			// 		if(temp.charAt(0)=='d'||temp.charAt(0)=='f')
			// 			flag=0;
			// 		else 
			// 			flag=1;
			// 		for(int k=1;k<temp.length();k++)
			// 		{
			// 			if(flag==0&&(temp.charAt(k)=='d'||temp.charAt(k)=='f'))
			// 				t=t+4;
			// 			else if((temp.charAt(k)=='d'||temp.charAt(k)=='f')&&flag==1)
			// 			{
			// 				t=t+2;
			// 				flag=0;
			// 			}
			// 			else if(flag==0&&(temp.charAt(k)=='j'||temp.charAt(k)=='k'))
			// 			{
			// 				t=t+2;
			// 				flag=1;
			// 			}
			// 			else
			// 			{
			// 				t=t+4;
			// 			}
			// 		}
			// 		map.put(temp,t);
			// 	}
			// 	sum+=t;
			// }
			// System.out.println(sum);
	 	// }
	// }
	//  	  		int a[]=new int[size];
	//  	  		a[0]=abc.nextInt();
	//  	  		int c=0;
	//  	  		for(int j=1;j<size;j++)
	//  	  		{
	//  	  			a[j]=abc.nextInt();
	//  	  			if(a[j]<a[j-1])
	//  	  				{
	//  	  					c++;
	//  	  				}
	//  	  		}
	//  	  		if(c==0)
	//  	  		{
	//  	  			System.out.println("YES");
	//  	  			continue;
	//  	  		}
	//  	  		else if(c>1)
	//  	  		{
	//   				System.out.println("NO");
	//  	  			continue;
	//  	  		}
	//  	  		else if(c==1&&a[0]>=a[size-1])
	//  	  		{
	//  	  			System.out.println("YES");
	//  	  			continue;
	//  	  		}
	//  	  		else
	//  	  		{
	//  	  			System.out.println("NO");
	//  				continue;
	//  	  		}

	//  	}
	// }
// public static int even(int n)
	// {
	// 	if(n==2)
	// 		return 1;
	// 	return n-1*even(n-2);
	// }
	//  	  		int a[]=new int[size];
	//  	  		int g=0;
	//  	  		HashMap<Integer,Integer> map=new HashMap<>();
	//  	  		for(int j=0;j<size;j++)
	//  	  		{
	//  	  			int t=abc.nextInt();
	//  	  			if(map.containsKey(t))
	//  	  			{
	//  	  				g=1;
	//  	  				map.put(t,map.get(t)+1);
	//  	  			}
	//  	  			else
	//  	  				map.put(t,1);
	//  	  			a[j]=t;
	//  	  		}
	//  	  		Arrays.sort(a);
	//  	  		long t=1;
	//  	  		if(g==0)
	//  	  		{
	//  	  			System.out.println("1");
	//  	  			continue;
	//  	  		}
	//  	  		for(int j=size-1;j>=0;)
	//  	  		{
	//  	  			int v=map.get(a[j]);
	//  	  			if(v>1)
	//  	  			{
	//  	  				if(map.get(a[j])%2==0)
	//  	  				{
	//  	  					t=t*even(v);
	//  	  				}
	//  	  				else
	//  	  				{
	//  	  					t=t*even(v+1);
	//  	  				}
	//  	  			}
	//  	  			j=j-v;
	//  	  		}
	//  	  		t=t%((long)Math.pow(10,9)+7);
	// 	System.out.println(t);

	// 	}
		
	// }	// public static void main(String[] args) {
	// Scanner abc=new Scanner(System.in);
 //  	int n=abc.nextInt();
 //  	for(int i=0;i<n;i++)
 //  	{
 // 	  		int size=abc.nextInt();
 // 	  		int a[]=new int[size];
 // 	  		int d[]=new int[size];
 // 	  		for(int j=0;j<size;j++)
 // 	  		{
 // 	  			a[i]=abc.nextInt();
 // 	  		}
 // 	  		for(int j=0;j<size;j++)
 // 	  		{
 // 	  			d[i]=abc.nextInt()-a[i];
 // 	  		}	
 // 	  		for(int j=0;j<size-2;j++)
 // 	  		{
 // 	  			if(d[j]!=0&&d[j+1]-d[j]==1)
 // 	  			{
 // 	  					{
 // 	  						d[k]=d[k]-t;
 // 	  						t++;
 // 	  					}
 // 	  			}
 // 	  			else if(d[j]!=0)
 // 	  			{
 // 	  				System.out.println("NIE");
 // 	  				break;
 // 	  			}
 // 	  		}
 // 	  	}
 // 	  }			int t=1;
 // 	  				for(int k=j;k<3+j;k++)
 	  	
 }
 // 	  		int k=1;
 // 	  		int day=0;
 // 	  		int a[]=new int[size];
 // 	  		int index=0;
 // 	  		while(k<size)
 // 	  		{
 // 	  			int k1=k;
 // 	  			day++;
 // 	  			for(int j=0;j<index;j++)
 // 	  			{
 // 	  				k+=a[j];
 // 	  			}
 // 	  			for(int j=index;j<k1&&index<size;j++)
 // 	  			{
 // 	  				int t=abc.nextInt();
 // 	  				k+=t;
 // 	  				a[index]=t;
 // 	  				index++;
 // 	  			}
 // 	  		}
 // 	  		while(index<size)
 // 	  		{
 // 	  			a[index]=abc.nextInt();
 // 	  			index++;
 // 	  		}
 // 	  		System.out.println(day);
	// }
// 	public static void main(String[] args) {
// 		Scanner abc=new Scanner(System.in);
// 	  	int n=abc.nextInt();
// 	  	for(int i=0;i<n;i++)
// 	  	{
// 	  		int size=abc.nextInt();
// 	  		int k=abc.nextInt();
// 	  		int c=k;
// 	  		int t=size-k;
// 	  		int a[]=new int[size];
// 	  		for(int j=0;j<size;j++)
// 	  		{
// 	  			a[j]=abc.nextInt();
// 	  		}
// 	  		Arrays.sort(a);
// 	  		while(t>0&&a[t]==a[t-1])
// 	  		{

// 	  			c++;
// 	  			t--;
// 	  		}
// 	  		System.out.println(c);
// 	  	}
// 	}
	// public static void main(String[] args) {
	// 	int a[]={6, 10, 14, 15, 21, 22, 26, 33, 34, 35, 38, 39, 46,51, 55, 57, 58, 62, 65, 69, 74, 77, 82, 85, 86, 87, 91, 93, 94, 95, 106, 111, 115, 118, 119, 122, 123, 129, 133, 134, 141, 142, 143, 145, 146, 155, 158, 159, 161, 166, 177, 178, 183, 185, 187, 194}
	// 	;Scanner abc=new Scanner(System.in);
 //     	int n=abc.nextInt();
 //     	for(int i=0;i<n;i++)
 //     	{
 //     		int num=abc.nextInt();
 //     		if(num<12)
 //     		{
 //    			System.out.println("NO");
 //    			continue;
 //    		}
 //    		int j=0,k=a.length-1,flag=0;
 //    		while(j<k)
 //    		{
 //    			if(a[j]+a[k]==num||a[j]*2==num||a[k]*2==num)
 //    			{
 //    				flag=1;
 //    				break;
 //    			}
 //    			else if(a[j]+a[k]<num)
 //    				j++;
 //    			else 
 //    				k--;
 //    		}
 //    		if(flag==1)
 //     				System.out.println("YES");
 //     		else
	//      		System.out.println("NO");
 //     	}
	// }
// 	static boolean prime(int n)
// 	{
// 		int c=0;
// 		for(int i=1;i<=n;i++)
// 		{
// 			if(n%i==0)
// 				c++;
// 		}
// 		if(c==2)
// 		{
// 			return true;
// 		}
// 		else
// 			return false;
// 	}
// 	static int checkSemiprime(int num) 
//     { 
//         int cnt = 0; 
      
//         for (int i = 2; i<=num; ++i) 
//         {             
//             if(num % i == 0&&prime(i)){ 
//                 num /= i;
//                 ++cnt; 
//                 } 
//                 if(cnt>2)
//                 	break;
// 		}				
// if(num!=1)
// {
// 	return 0;
// }
//                 return cnt == 2 ? 1: 0; 
//     } 
    
//     public static void main(String[] args) {
//     	Scanner abc=new Scanner(System.in);
//     	int n=abc.nextInt();
//     	for(int i=0;i<n;i++)
//     	{
//     		//System.out.print(i)
//     		int num=abc.nextInt();
//     		//num=i;
//     		if(num<12)
//     		{
//     			System.out.println("NO");
//     			continue;
//     		}
//     		if(num%2==0&&checkSemiprime(num/2)==1)
//     			{System.out.println("YES");
//     			    			continue;}
//     		int flag=0;
//     		int j=6;
//     		while(j<num/2)
//     		{
//     			if(checkSemiprime(j)==1 &&checkSemiprime(num-j)==1)
//     			{
//     				flag=1;
//     			}
//     			j++;
//     		}
//     		if(flag==1)
//     				System.out.println("YES");
//     		else
//     		System.out.println("NO");
//     	}
//     }