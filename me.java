import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class me //implements bla
{
	static  int [] afc()
	{
		Scanner abc =new Scanner(System.in);
		int n=abc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=abc.nextInt();
		}
		abc.close();
		return a;
	 }
// 	final static int player1Symbol = 1;
// final static int player2Symbol = 2;
	// public void print()
	// {
	// 	return;
	// }
	// static void swap(int a, int b)
	// {
	// 	int temp=a;
	// 	a=b;
	// 	b=temp;
	// }

    // public static String findMinSubstringContainingString(String large, String small){
    //    	int fre[]=new int[26];
    //     String output="";
    //     for(int i=0;i<small.length();i++)
    //     {
    //         int index=small.charAt(i)-'a';
    //             fre[index]++;
    //     }
    //     for(int i=0;i<large.length();i++)
    //     {
    //         int index=large.charAt(i)-'a';
    //         //System.out.println(index+" "+large.charAt(i));
    //         if(large.charAt(i)==32)
    //         { 
    //             output+=" ";
    //         }
    //         else if(fre[index]!=0)
    //         {
    //           fre[index]--;
    //             output+=large.charAt(i);
    //         }
    //     }
    //     return output;
    // }

     static int multiply(int x, int res[], int res_size) //for large nos using array with ressize=1 and arr[0]=1  
    { 
        int carry = 0; // Initialize carry 
  
        // One by one multiply n with individual  
        // digits of res[] 
        for (int i = 0; i < res_size; i++) 
        { 
            int prod = res[i] * x + carry; 
            res[i] = prod % 10; // Store last digit of  
                                // 'prod' in res[] 
            carry = prod/10; // Put rest in carry 
        } 
  
        // Put carry in res and increase result size 
        while (carry!=0) 
        { 
            res[res_size] = carry % 10; 
            carry = carry / 10; 
            res_size++; 
        } 
        return res_size; 
    }

    static public int power(int x1,int y) { //faster way by dividing into odd and even and /2
    	long res = 1l;     
    	long p=100000L;
    	long x=(long)x1;     
    	//x = x % p;      
    	while (y > 0)    {
    	        if ((y & 1)==1)  
    	                  res =(res * x) % p;
    	        y = y >> 1;       
    	     	 x =(x*x) % p;      
    	     }    
    	     System.out.println(res%p);
    	          return (int) (res % p);
}
public static void main(String[] args) throws IOException{

		int a=0,b=10,c;
		c=b%a;
		System.out.println(c);
	}
// 		long n=(new Scanner(System.in)).nextLong();
//         int sum=1;
//         int n1=(int)(n%100000L);
//         if(n1==0){
//             int t=((int)(n%1000000L))/100000;
//             sum=(30000*t)%100000;
//         }
//         for(int i=2;i<=n1;i++){
//             if(i%10==0)
//                 continue;
//             int t=power(i,n1);
//            //System.out.println(t+" "+sum);
            
// 			sum+=t;
//             sum=sum%100000;
            
//         }
// //         long k=n/100000;
//         k--;
//         int mod=(int)(n%100000);
//         sum+=(k*arr[99999])%100000;
//         sum%=100000;
//         if(n>100000){
//             sum+=arr[mod-1];
//         }
        // String s=Long.toString(sum);
        // if(s.length()<5)
        // {
        //     int l=s.length();
        //     for(int i=0;i<5-l;i++)
        //         s="0"+s;
        // }
        // System.out.println(s);
		// Write your code here

		// Scanner abc=new Scanner(System.in);
		// int t =abc.nextInt();

		// for(int i=0 ; i<t; i++)
		// {
		// 	int N = abc.nextInt();
		// 	int A =abc.nextInt();
		// 	int B = abc.nextInt();
		// 	int K = abc.nextInt();
		
		// int a = N/A;
		// a+= N/B;
		// int hcf=1;
		// for(int j =1; j<=Math.min(A,B);j++)
		// {
		// 	if(A%j==0 && B%j==0)
		// 	{
		// 		hcf=j;
		// 	}
		// }

		// int lcm= A*B/hcf;
		// a-= 2*(N/lcm);
		// if(a>=K)
		// {
		// 	System.out.println("Win");
		// }
		// else
		// {
		// 	System.out.println("Lose");
		// }

		// }
		// int arr[]=new int[n];
		// ArrayList l1=new ArrayList();
		// ArrayList l2=new ArrayList();
		// int flag=0;
		// for(int i=0;i<n;i++){
		// 	arr[i]=abc.nextInt();
		// 	if(i>0){
		// 		if(flag==0&&arr[i-1]>arr[i])
		// 		{
		// 			flag=1;
		// 			l1.add(i-1);
		// 		}else if(flag==1&& arr[i-1]<arr[i]){
		// 			flag=0;
		// 			l2.add(i-1);
		// 		}
		// 	}

		// }
		// int a=0,b=0,max=0;
		// for(int i=0;i<l2.size();i++){
		// 	int c=0;
		// 	int k=l2.get(i);			
		// 	for(int j=l1.get(i);j<=l2.get(i);j++){
		// 		if(arr[j]==k+1)
		// 			c++;
		// 			k--;
		// 	}
		// 		if(c>max){
		// 			a=l1.get(i);
		// 			b=l2.get(i);
		// 		}
		// 	}
		
		// HashMap<Integer, Integer> h=new HashMap<>();
		// // Write your code here
  //      	int c=0;
  //       Scanner abc=new Scanner(System.in);
  //       int n=abc.nextInt();
  //       //String[] arr=new String[n];
  //       for(int i=0;i<n;i++){
  //           //arr[i]=abc.next;
  //           String t=abc.next();
  //           if(h.containsKey(t)){
  //               h.put(t,h.get(t)+1);
  //           }else{
  //               h.put(t,1);
  //           }
  //       }
  //      	Set<String> s=h.key;//=h.KeySet();
        
        // for(String i:s){
        //     for(String j:s){
        //         int t=h.get(j);
        //         if(t>1 && i.equals(j)){
        //             c+=t*(t-1);
        //         }else if(i.contains(j)){
        //             c+=
        //         }
        //     }
        // }
        // System.out.println(c);

		// char a=' ';
		// System.out.println((int)a);
		// String l="looks for minimum string";
		// String s="mums";
		// System.out.println(findMinSubstringContainingString(l,s));
		// int e1=2,e2=3;
		// swap(e1,e2);
		// System.out.println(e1+" "+e2);
		// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		// //System.out.println(nr[0]);
		// int n = Integer.parseInt(nr[0]);

		// String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		// for(int i=0;i<n;i++)
		// {
		// 	System.out.println(arrItems[i]);
		// }
		// int a=0xF;
		// int b=a+1;
		// if(a>10)
		// System.out.println(b);
		// Integer i=10;
		// ArrayList obj=new ArrayList();
		//obj.add(i);
		// int a=doubleCheck();
		// System.out.println(a);
	
	// public static int doubleCheck()
	// {
	// 	try
	// 	{
	// 		vsy.check();
	// 	}
	// 	catch(vsyException e){
	// 		System.out.println(e);
	// 		return 100;
	// 	}
	// 	finally
	// 	{
	// 		System.out.println("10");
	// 	}
	// 	return 200;
	// }
		//helpMe abc=new help();
		// Calculator abc;
		// System.out.println(abc);
		// Scanner s = new Scanner(System.in);
		// int V = s.nextInt();
		// int E = s.nextInt();
		// int adj[][]=new int[V][V];
  //     	int v[]=new int[V];
     
		// for(int i=0;i<E;i++)
  //       {
  //          	int si=s.nextInt();
  //     		int ei=s.nextInt();
  //         	adj[si][ei]=1;
  //         	adj[ei][si]=1;
  //       }
  //     Queue<Integer> q=new LinkedList<>();
  //     HashMap<Integer,Integer> map=new HashMap<>();
  //     int si=s.nextInt();
  //     		int ei=s.nextInt();
  //     q.add(si);
  //       v[si]=1;
  //      // System.out.println("1");
  //    	out:
  //       while(!q.isEmpty())
  //       {//System.out.println("2");
  //         int i=q.remove();
  //         for(int j=0;j<V;j++)
  //         {

  //           if(adj[i][j]==1&&v[j]==0)
  //           {
		// 		//System.out.println("3");
  //             v[j]=1;
  //             map.put(j,i);
  //             q.add(j);
  //             if(j==ei)
  //             	{
  //             		//System.out.println("4");
  //               	break out;
  //           	}
  //           }
  //         }
       // }
      
  //     for(int i=0;i<V;i++)
  //     {
  //       for(int j=0;j<V;j++)
  //       {
  //         System.out.print(adj[i][j]+" ");
  //       }
  //       System.out.println();
  //     }
  //  for(int i=0;i<V;i++)
  //  {
  //    System.out.print(v[i]+" ");
  //  }
  //     for(int i=0;i<V;i++)
  //     {
  //       System.out.println(map.get(i));
  //     }
      
  //     System.out.println("1");
  //   int j=ei;
  //     if(map.containsKey(ei))
  //     {
		// System.out.println("2");
  //     while(j!=si)
  //     {
  //      System.out.print(j+" ");
  //       j=map.get(j);
  //     }
  //       System.out.print(si);
  //     }
	// Scanner s=new Scanner(System.in);

	// OthelloBoard b = new OthelloBoard();
	
	// int n = s.nextInt();
	// b.print();
	// boolean p1Turn = true;
	// while(n > 0) {
	// 	int x = s.nextInt();
	// 	int y = s.nextInt();
	// 	boolean ans = false;
	// 	if(p1Turn) {
	// 		ans = b.move(player1Symbol, x, y);
	// 	}
	// 	else {
	// 		ans = b.move(player2Symbol, x, y);
	// 	}
	// 	if(ans) {
	// 		b.print();
	// 		p1Turn = !p1Turn;
	// 		n--;
	// 	}
	// 	else {
	// 		System.out.println(ans);
	// 	}
	// }
	
	//}
	//private Size;
	// public static int countStepsTo1(int n){
 //     int arr[]=new int[n+1];
 //      for(int i=1;i<n+1;i++)
 //        arr[i]=n-i;
 //      for(int i=n;i>1;i--)
 //      {
 //        if(i%2==0)
 //        {
 //          arr[i/2]=Math.min(1+arr[i],arr[i/2]);
 //          if(arr[i/2]>1+arr[i])
 //          {
 //            int k=1+arr[i]+1;
 //       		for(int j=i/2-1;j>0;j--)
 //              arr[j]=Math.min(arr[j],k++);
 //          }
 //        }
 //        if(i%3==0)
 //        {  arr[i/3]=Math.min(arr[i]+1,arr[i/3]);
 //        	 if(arr[i/3]>1+arr[i])
 //          {
 //            int k=1+arr[i]+1;
 //       		for(int j=i/3-1;j>0;j--)
 //              arr[j]=Math.min(arr[j],k++);
 //          }
 //        }
 //      }
 //      return arr[1];
 //      }
	// static int abc(int a)
	// {
	// 	try
	// 	{
	// 		return a;
	// 	}
	// 	finally
	// 	{
	// 		return 2*a;
	// 	}
	// }
	// public static int knapsack(int[] wt,int value[],int maxWeight){

	// /* Your class should be named Solution.
	//  * Don't write main() function.
	//  * Don't read input, it is passed as function argument.
	//  * Return output and don't print it.
	//  * Taking input and printing output is handled automatically.
	//  */
	// 	int m=wt.length;
 //    	int arr[][]=new int[m+1][maxWeight+1];
 //      for(int i=0;i<=maxWeight;i++)
 //        arr[0][i]=0;
 //      for(int i=0;i<=m;i++)
 //        arr[i][0]=0;
 //      for(int i=1;i<=m;i++)
 //      {
 //        int prv=0;
 //        for(int j=1;j<=maxWeight;j++)
 //        {
 //          if(j<wt[i-1])
 //            arr[i][j]=arr[i-1][j];
 //          else if(wt[i-1]<=j&&j<wt[i-1]+prv)
 //            arr[i][j]=Math.max(value[i-1],arr[i-1][j]);
 //          else
 //            arr[i][j]=value[i-1]+arr[i-1][j-wt[i-1]];
 //        }
        
 //      }
 //      return arr[m][maxWeight];
	// }
	// static void in(int a)
	// {
	// 	System.out.println(a);
	// }
	// public static int solve(String S,String V){
	// 	ArrayList<String> temp=combinations(V);
 //      	HashMap<String,Integer> map=new HashMap<>();
 //      for(int i=0;i<temp.size();i++)
 //      {
 //        map.put(temp.get(i),temp.get(i).length());
 //      }
 //      temp=combinations(S);
 //      int size=Integer.MAX_VALUE;
 //       for(int i=0;i<temp.size();i++)
 //       {
 //         if(!map.containsKey(temp.get(i)))
 //         {
 //           size=Math.min(size,temp.get(i).length());
 //         }
 //       }
	// 	return size;
	// }
 //  static ArrayList<String> combinations(String S)
 //  {
 //    if(S.length()==0)
 //    {
 //      ArrayList<String> temp=new ArrayList<>();
 //      temp.add(S);
 //      return temp;
 //    }
 //    ArrayList<String> prv=combinations(S.substring(1));
 //    ArrayList<String> ans=new ArrayList<String>();
 //    for(int i=0;i<prv.size();i++)
 //    {
 //      ans.add(prv.get(i));
 //      ans.add(S.charAt(0)+prv.get(i));
 //    }
 //    return ans;
 //  }
	// public static void main(String[] args) 
	// {	

	// 	//System.out.println("Coordinated already occupied '\n' Enter different coordinantes");
	// 	 Checkprivate abc=new Checkprivate();
	// 	// abc.print()
	// 	// System.out.println("Name already excited"+"\n"+"Enter new name for player 2");
	// 	// String a="babab";
	// 	// String b="babba";
	// 	// System.out.println(solve(a,b));
	// 	// me abc=new me();
	// 	// abc.in(5);

	// 	// int a=afc();
	// 	// int b=afc();
	// 	// System.out.println(knapsack());
	// 	// Scanner abc=new Scanner(System.in);
	// 	// int n=abc.nextInt();
	// 	// String ans[]=new String[n];
	// 	// for(int i=0;i<n;i++)
	// 	// {
	// 	// 	int k=0;
	// 	// 	int l=0;
	// 	// 	String a=abc.next();
	// 	// 	String b=abc.next();
			
	// 	// 	for(int j=0;j<3;j++)
	// 	// 	{
	// 	// 		if(k!=2&&(a.charAt(j)=='b'||b.charAt(j)=='b'))
	// 	// 			k++;
	// 	// 		else if(l!=1&&(a.charAt(j)=='o'||b.charAt(j)=='o'))
	// 	// 			l++;
	// 	// 	}
	// 	// 	if(k==2&&l==1)
	// 	// 		ans[i]="yes";
	// 	// 	else
	// 	// 		ans[i]="no";
	// 	// }
	// 	// for (int i=0;i<n ;i++ ) {
	// 	// 	System.out.println(ans[i]);
	// 	// }
	// 	// int a=abc(10);
	// 	// System.out.println(a);
	// 	// Scanner abc=new Scanner(System.in);
	// 	//  int n=abc.nextInt();
	// 	//  System.out.println();
	// 	// findPairsDifferenceK(afc(),n);	
	// 	//System.out.println(maxFrequencyNumber(afc()));
	// 	// Write your code here
	// // Scanner abc=new Scanner(System.in);
 // //      String a=abc.nextLine();
 // //      a=a;
 // //   	int b=a.length();
 // //   	System.out.println(b);
 // //      int[] arr=new int[b];
 // //      for(int i=0;i<b;i++)
 // //      {
 // //        arr[i]=(int)a.charAt(i);
 // //      }
 // //      Arrays.sort(arr);
 // //      int c=0;
 // //      for(int i=0;i<b-1;i++)
 // //      {
 // // 		 System.out.println((char)arr[i]);
 // //           if(arr[i]==arr[i+1])
 // //          	 c++;
 // //      }
      
 // //        System.out.println(c);
 //    }
 //    public static void findPairsDifferenceK(int[] input, int k)
 //    {
	// 	HashMap<Integer,Integer> map=new HashMap<>();
 //        for(int i=0;i<input.length;i++)
 //        {
 //          if(map.containsKey(input[i]))
 //            map.put(input[i],map.get(input[i])+1);
 //            else
 //              map.put(input[i],1);
 //        }
 //      Set <Integer> abc=map.keySet();
 //      if(k==0){
 //        for(Integer i:abc)
 //        { 
 //          int t=map.get(i);
 //          if(t>1)
 //          {
 //            for(int j=0;j<(t*(t-1)/2);j++)
 //              System.out.println(i+" "+i);
 //          }
 //        }
 //        return;
 //      }
 //      else
 //      {
 //        for(Integer i:abc)
 //        {
 //          int t=k+i;
 //          if(map.containsKey(t))
 //          {
 //            int M=Math.max(t,i);
 //            int m=Math.min(i,t);
 //            for(int j=0;j<(map.get(i)*map.get(t));j++)
 //              System.out.println(m+" "+M);
 //          }
 //        }
 //      }
	// }
 //    public static int maxFrequencyNumber(int[] arr){
	// 	/* Your class should be named Solution
	// 	 * Don't write main().
	// 	 * Don't read input, it is passed as function argument.
	// 	 * Return output and don't print it.
	//  	 * Taking input and printing output is handled automatically.
	// 	*/
	// 	HashMap<Integer,Integer> map=new HashMap<>();
 //      for(int i=0;i<arr.length;i++)
 //      {
 //        if(map.containsKey(arr[i]))
 //        {

          

 //          map.put(arr[i],map.get(arr[i])+1);
 //        }
 //        else
 //          map.put(arr[i],1);
 //      System.out.println(map);
 //      }
 //      Set<Integer> abc=map.keySet();
 //      int max=0;
 //      int a=arr[0];
 //      //System.out.println(abc);
 //      for(Integer i:abc)
 //      {
 //        if(max<map.get(i))
 //        {a=i;
 //        max=map.get(i);
 //        }
 //      }
 //      return(a);
	// }
	// 	public static int maximumProfit(int budget[]) {
		
 //      Arrays.sort(budget);
 //      int sum=0;
 //      for(int i=0;i<budget.length;i++)
 //      {
 //      int temp=budget[i]*(budget.length-i);
 //      	if(temp>sum)
 //        	sum=temp;
 //      }
 //      return(sum);
	// }





 // public static void print(Node<Integer> head){
 //    Node<Integer> temp = head;

 //    while(temp != null){
 //        System.out.print(temp.data +" ");
 //        temp = temp.next;
 //    }
 //    System.out.println();


// public static void increment(Node<Integer> head){
//     Node<Integer> temp = head;
//     while(temp != null){
//         temp.data++;
//         temp = temp.next;
//     }
// }

// static Stack<Character> abc=new Stack<>();
// static int temp=0;
// 	public static boolean checkBalanced(String exp) {
//       // if(!abc.empty())
//       // System.out.println(abc.peek());
//   System.out.println(exp);
//       if(exp.length()==0)
//       {
//       	System.out.println("-");
//         if(abc.isEmpty())
//           return true;
//         else
//           return false;
//       }
//       	if(exp.charAt(0)=='{'||exp.charAt(0)=='['||exp.charAt(0)=='(')
//         {
//         	//System.out.println("*");
//           abc.push(exp.charAt(0));
//         }
    
//       else if(exp.charAt(0)=='}'||exp.charAt(0)==']'||exp.charAt(0)==')')
//       {
//       	System.out.println("+");
//         if(abc.empty())
//         {
        	
//           return false;
//         }
//       	char t=abc.pop();
//         if((exp.charAt(0)=='}'&&t!='{')||(exp.charAt(0)==']'&&t!='[')||(exp.charAt(0)==')'&&t!='('))
//           {
//           	return false;
// }      }

   
//       return (checkBalanced(exp.substring(1)));
// }
// public static void main(String args[])
// 	{
// 		Scanner abc=new Scanner(System.in);
// 		System.out.println(checkBalanced(abc.nextLine()));

// 		// int a[]=afc();
// 		// System.out.println(maximumProfit(a));
// 		// Scanner abc =new Scanner(System.in);
// 		// int x=abc.nextInt();
// 		// int j=abc.nextInt();
// 		// int a[]=afc();
// 		// int c=0;
// 		// for(int i=0;i<a.length;i++ ) 
// 		// {
// 		// 	if(a[i]>=x&&(a[i]-x)%j==0)
// 		// 		c++;	
// 		// }
// 		// System.out.println(c);
// // 	ArrayList<Integer>a =new ArrayList<>();
// // 	ArrayList<Integer>b =new ArrayList<>();
// // 	Scanner z1=new Scanner(System.in);
// // 	int n=z1.nextInt();
// // 	int k=n;
// // 	int ar[]=new int[n];
// // 	//int a[]=new int[n];
// // 	//int i=0,j=0;
// // 	//int b[]=new int[n-n/2];
// // 	int z=(n*(n+1))/2;
// // 	int y=z/2;
// // 	int x=z-z/2;
// // while(y!=0)
// // {
// // 	if(y>=n)
// // 		{y=y-n;
// // 	a.add(n);
// // 	ar[n-1]=-1;}
// // 	n--;
// // }
// // while(x!=0)
// // {
// // 	if(x>=k&&ar[k-1]!=-1)
// // 	{
// // 		x=x-k;
// // 		b.add(k);
// // 	}
// // 	k--;
// // }

// 	// b[n-n/2-1]=1;
// 	// if(n%4==0)
// 	// {
// 	// 	while(n>0)
// 	// 	{
// 	// 		if(n>k/2)
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				a[i++]=n;
// 	// 			else
// 	// 				b[j++]=n;
// 	// 		}
// 	// 		else
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				b[j++]=n;
// 	// 			else
// 	// 				a[i++]=n;
// 	// 		}
// 	// 		--n;
// 	// 	}
// 	// }
// 	// else if(n%2==0)
// 	// {
// 	// 	while(n>0)
// 	// 	{
// 	// 		if(n>=k/2)
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				a[i++]=n;
// 	// 			else
// 	// 				b[j++]=n;
// 	// 		}
// 	// 		else
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				b[j++]=n;
// 	// 			else
// 	// 				a[i++]=n;
// 	// 		}
// 	// 		--n;
// 	// 	}
// 	// }
// 	// else if((n+1)%4==0)
// 	// {
// 	// 	while(n>1)
// 	// 	{
// 	// 		if(n>k/2)
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				b[i++]=n;
// 	// 			else
// 	// 				a[j++]=n;
// 	// 		}
// 	// 		else
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				a[j++]=n;
// 	// 			else
// 	// 				b[i++]=n;
// 	// 		}
// 	// 		--n;
// 	// 	}
// 	// }
// 	// else
// 	// {
// 	// 	while(n>1)
// 	// 	{
// 	// 		if(n>=k/2)
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				b[i++]=n;
// 	// 			else
// 	// 				a[j++]=n;
// 	// 		}
// 	// 		else
// 	// 		{
// 	// 			if(n%2==0)
// 	// 				a[j++]=n;
// 	// 			else
// 	// 				b[i++]=n;
// 	// 		}
// 	// 		--n;
// 	// 	}
// 	// }
// 	// System.out.println(a.size());
// 	// for(int l=0;l<a.size();l++)
// 	// 	System.out.print(a.get(l)+" ");
// 	// System.out.println();
// 	// System.out.println(b.size());
// 	// for(int l=0;l<b.size();l++)
// 	// 	System.out.print(b.get(l)+" ");

// 	// extra<Integer> abc=new extra<>();
// 	// abc.pail(abc.tI(a));
// 	// System.out.println();
// 	// abc.pail(abc.tI(b));
	
//     // Node<Integer> node1 = new Node<Integer>(10);
//     // Node<Integer> node2 = new Node<Integer>(20);
//     // node1.next = node2;
//     // increment(node1);
//     // print(node1);
//    }

	
	// // static int temp[][]={{}};
	// // static int temp1[][]={};
 // // 	public static int[][] subsetsSumK(int input[], int k) 
 // // 	{
	// // 	return(me(input,0,k));
	// // }

 // //    static int [][] me(int a[],int n,int k)
 // //    {
 // //    	int c=0;
 // //    	if(n==1)
 // //    	{
 // //    		int [][]t=new int[0][0];
 // //    		return t;
 // //    	}
 // //    	if(n>=a.length)
 // //    		if(k==0)
 // //    		return temp;
 // //    		else
 // //    			return temp1;

    	
 // //    	int[][] r=new int[0][0];
 // //    	if(a[n]<=k)
 // //    		r=me(a,n+1,k-a[n]);
 // //    	    	int r1[][]=me(a,n+1,k);
 // //    	int ans[][]=new int[r.length+r1.length][];
 // //    	for(int i=0;i<r1.length;i++)
 // //    		ans[c++]=r1[i];
 // //    	for(int i=0;i<r.length;i++)
 // //    	{
 // //    		ans[c]=new int[r[i].length+1];
 // //    		ans[c][0]=a[n];
 // //    		for(int j=0;j<r[i].length;j++)
 // //    			ans[c][j+1]=r[i][j];
 // //    		c++;
 // //    	}
 // //    	return ans;
    	
 // //    }
    // public static void main(String[] args) {
    // 	int b[]={5,12,3,17,1,18,15,3,17};
    // 	int a[][]=me(b,0,6);
    // 	//System.out.println(a.length);
    // 	for(int i=0;i<a.length;i++)
    // 	{	
    // 		for(int j=0;j<a[i].length;j++)
    // 			System.out.print(a[i][j]+" ");
    // 		System.out.println();
    // 	}
 //    }
// static String []t={""};
// static int cal(String a)
//   {
//     if(a.length()==1)
//       return (int)a.charAt(0)-48;
//     else
//     {
//      return (((int)a.charAt(0)-48)*10+((int)a.charAt(1)-48));
//     }
//   }
// 	// Return a string array that contains all possible codes
// 	public static  String[] getCode(String input)
//     {
//       if(input.length()==0)
//         return t;
//     int k=0;
  
  
// 	 String temp_1[]=getCode(input.substring(1));
//   String temp_2[] = new String[0];

//   if(input.length()>1&&cal(input.substring(0,2))<=26)
//    	 temp_2 = getCode(input.substring(2));

// 	String ans[]=new String[temp_1.length+temp_2.length];
//   	for(int i=0;i<temp_1.length;i++)
//     {
//       ans[k++]=(char)(cal(input.substring(0,1))+96)+temp_1[i];
//     }
//   for(int i=0;i<temp_2.length;i++)
//     {
//       ans[k++]=(char)(cal(input.substring(0,2))+96)+temp_2[i];
//     }
//   return ans;
// }


	// static String []t={""};
	// public static String[] permutationOfString(String input)
	// {
	// 	int k=0;

	// 	if(input.length()==0)
	// 		return t;
	// 	String temp[]=permutationOfString(input.substring(1));
	// 	String ans[]=new String[input.length()*temp.length];
	// 	for(int i=0;i<temp.length;i++)
	// 	{
	// 		for(int j=0;j<input.length();j++)
	// 		{
	// 			ans[k++]=temp[i].substring(0,j)+input.charAt(0)+temp[i].substring(j,temp[i].length());
	// 		}
	// 	}
	// 	return ans;
	// }
	// public static void main(String[] args) 
	// {
	// 	String input="121";
	// 	String a[]=permutationOfString(input);
	// 	for(int i=0;i<a.length;i++)
 //    			System.out.println(a[i]);
	// }
// {
// 	static String[] t={""};
	// static String help(int n)
	// 	{
	// 		if(n<2)
	// 			return "";
	// 		else if(1<n&&n<7)
	// 			return (""+(char)((n-2)*3+97)+(char)((n-2)*3+98)+(char)((n-2)*3+99)+"");
	// 		else if(n==7)
	// 			return (""+(char)((n-2)*3+97)+(char)((n-2)*3+98)+(char)((n-2)*3+99)+(char)((n-2)*3+100)+"");
	// 		else
	// 		{
	// 			if(n==9)
	// 				return (""+(char)((n-2)*3+98)+(char)((n-2)*3+99)+(char)((n-2)*3+100)+'z'+"");
	// 			return (""+(char)((n-2)*3+98)+(char)((n-2)*3+99)+(char)((n-2)*3+100)+"");
	// 		}
	// 	}
// 	public static String[] keypad(int n)
//     {
//     	int k=0;
//     	if(n==0)
//     	return t;
//     String temp[]=keypad(n/10);
//     String a=help(n%10);
//     String ans[]=new String[a.length()*temp.length];
//     for(int i=0;i<a.length();i++)
//     {
//     	for(int j=0;j<temp.length;j++)
//     		ans[k++]=temp[j]+a.charAt(i);
//     }
//     return ans;
//     }
		// public static void main(String[] args) {
		// 	Scanner abc=new Scanner(System.in);
		// 	int n=abc.nextInt();
		// 	for(int i=1;i<=n;i++)
		// 	{
		// 		for(int j=1;j<=n+1-i;j++)
		// 			System.out.print(j);
		// 		for(int j=1;j<i;j++)
		// 			System.out.print("**");
		// 		for(int j=n+1-i;j>0;j--)
		// 			System.out.print(j);
		// 		System.out.println();
		// 	}
			// String[]a=keypad(23);
			// int a=cal(10);
			// for(int i=0;i<a.length;i++)
			// System.out.println(a[i]);
			// for(int i=0;i<10;i++)
			// 	System.out.println(help(i));
			//printKeypad(23);
		//}
		// static int cal(int a)
		// {
		// 	 int bla(int b)
		// 	{
		// 		return b;
		// 	}
		// 	int c=bla(a);
		// 	return c;
		// }
// }

	// public static void printKeypad(int input)
	// {
	// 	printKeypad(input,"");
	// }
	// static void printKeypad(int a,String o)
	// {
	// 	if(a==0)
	// 	{
	// 		System.out.println(o);
	// 	}
	// 	String b=help(a%10);
	// 	for(int i=0;i<b.length();i++)
	// 		printKeypad(a/10,b.charAt(i)+o);

	// }
	// static int fib(int n)
 //    {
 //    if (n <= 1)
 //       return n;
 //    return fib(n-1) + fib(n-2);
 //    }
	
 //      static void merge(int arr[], int l, int m, int r)
 //    {
 //        // Find sizes of two subarrays to be merged
 //        int n1 = m - l + 1;
 //        int n2 = r - m;
 
 //        /* Create temp arrays */
 //        int L[] = new int [n1];
 //        int R[] = new int [n2];
 
 //        /*Copy data to temp arrays*/
 //        for (int i=0; i<n1; ++i)
 //            L[i] = arr[l + i];
 //        for (int j=0; j<n2; ++j)
 //            R[j] = arr[m + 1+ j];
 
 
 //        /* Merge the temp arrays */
 
 //        // Initial indexes of first and second subarrays
 //        int i = 0, j = 0;
 
 //        // Initial index of merged subarry array
 //        int k = l;
 //        while (i < n1 && j < n2)
 //        {
 //            if (L[i] <= R[j])
 //            {
 //                arr[k] = L[i];
 //                i++;
 //            }
 //            else
 //            {
 //                arr[k] = R[j];
 //                j++;
 //            }
 //            k++;
 //        }
 
 //        /* Copy remaining elements of L[] if any */
 //        while (i < n1)
 //        {
 //            arr[k] = L[i];
 //            i++;
 //            k++;
 //        }
 
 //        /* Copy remaining elements of R[] if any */
 //        while (j < n2)
 //        {
 //            arr[k] = R[j];
 //            j++;
 //            k++;
 //        }
 //    }
 
 //    // Main function that sorts arr[l..r] using
 //    // merge()
 //  static  void sort(int arr[], int l, int r)
 //    {
 //        if (l < r)
 //        {
 //            // Find the middle point
 //            int m = (l+r)/2;
 
 //            // Sort first and second halves
 //            sort(arr, l, m);
 //            sort(arr , m+1, r);
 
 //            // Merge the sorted halves
 //            merge(arr, l, m, r);
 //        }
 //    }

 //  static String t[]={""};
	// static String t2[]={};
 //      static String[] sort(int a[],int n,int x,int c)
 //      {
      	
 //      	int k=0;
 //      	if(n>=a.length)
 //      	{
 //          if(x==0)
 //         	 return t;
 //          else 
 //            return t2;
 //      	}
      
 //      	String temp[]=sort(a,n+1,x,c);
 //      	String temp_1[]=new String[0];
 //      	if(x>=a[n])
 //      		temp_1=sort(a,n+1,x-a[n],c--);
 //      	String ans[]=new String[temp.length+temp_1.length];
 //      	for(int i=0;i<temp_1.length;i++)
 //      		ans[k++]=""+a[n]+" "+temp_1[i];
 //      	for(int i=0;i<temp.length;i++)
 //      		ans[k++]=""+temp[i];
 //      	return ans;
 //      }
	// public static void FindTriplet(int[] arr, int x)
	// {
	// 	sort(arr,0,arr.length-1);
 //          String a[]=sort(arr,0,x,3);
 //      for(int i=0;i<a.length;i++)
 //      {
 //      	if(a[i].length()==6)
 //        System.out.println(a[i]); 
 //      } 
	// }
	// me()
	// {
	// 	System.out.println();
	// }
	// void me2()
	// {
	// 	System.out.println();
	// }
	// interface a
	// {
	// 	 int a1=10;
	// }
	// static int a=10;
	// static void ab()
	// {
	// 	a++;
	// 	System.out.println(a);
	// }
    // public static void main (String args[])
    // {
    // 	extra<Integer> abc=new extra<>();
    // 	Integer a[]={1,2,3};
    // 	abc.pail(a);

    	//me1 a=new me1();
    	// System.out.print();tln();
 		   	// int i=0;
    	// int j=arr.length-1;
    	// while(i<j)
    	// {
    	// 	int c=1;
    	// 	int c2=1;
    	// 	if(arr[i]+arr[j]==num&&arr[i]!=arr[j])
    	// 	{
    	// 		int t=i;
    	// 		int t2=j;
    	// 		while(i<j&&arr[i]==arr[++i])
    	// 			c++;
    	// 		while(i<j&&arr[j]==arr[--j])
    	// 			c1++;
    	// 		for(int i=0;i<c*c1;i++)x
    	// 			arr[t]+" "+arr[t2];	
    	// 	}
    	// 	else if (arr[i]+arr[j]==num&&arr[i]==arr[j]) 
    	// 	{
    	// 		int sum=0;
    	// 		for(int k=1;k<=(j-i);k++)
    	// 			sum=sum+k;
    	// 		for(int k=1;k<=sum;k++)
    	// 			System.out.println(arr[i]+" "+arr[j]);
    	// 		break;
    	// 	}
    	// 	else if(num>arr[i]+arr[j])
    	// 		i++;
    	// 	else
    	// 		j--;

    		
    	
    	// while(i<arr1.length&&j<arr2.length)
    	// {
    	// 	if(arr1[i]==arr2[j])
    	// 	{
    	// 		System.out.println(arr1[i])
    	// 		i++;j++;
    	// 	}
    	// 	else
    	// 	{
    	// 		if(arr1[i]>arr2[j])
    	// 			j++;
    	// 		else 
    	// 			i++;
    	// 	}
    	// }
    	//int []a=afc();
    	//Scanner abc =new Scanner(System.in);
    	//int n = abc.nextInt();
    //System.out.println(a[0]+" "+a[1]);
    //}
    // public static int findFloor(int[] array, int element)//findfloor
    // {
    // 	//if(element>array[0])
    // 	return findFloor(array,1,element);
    // 	//return 
    // }
    // private static int findFloor(int a[],int n,int x)
    // {
    // 	if(n>=a.length)
    // 		return(a[a.length-1]);
    // 	else if(a[n]==x)
    // 		return a[n];
    // 	else if(a[n]>=x)
    // 		return a[n-1];
    // 	else 
    // 		return findFloor(a,n+1,x);
    // }
}

// abstract class me1
// {
// abstract void me2()
// {
// 	System.out.println();
// };
// }