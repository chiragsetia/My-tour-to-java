import java.util.*;
import java.lang.*;
class rg
{
	public static void main(String[] args) {
			Scanner abc=new Scanner(System.in);
		int t=abc.nextInt();
		for(int i=0;i<t;i++)
		{
			ArrayList<Integer> al=new ArrayList<>();
			int n=abc.nextInt();
			int k=abc.nextInt();
			int arr[]=new int[n];
			
			for(int j=0;j<n;j++)
			{
				al.add(abc.nextInt());
			}
				if(al.size()==1)
				{
					System.out.println(al.get(0));
					continue;
				}
			int sum=0;
			Collections.sort(al);
			while(true)
			{
				
				while(true)
				{
					if(Math.min(al.get(0),al.get(1))<=k)
						break;
					al.set(0,al.get(0)-1);
					al.set(1,al.get(1)-1);
				}
				sum+=al.get(0);
				al.remove(0);
				if(al.get(0)<=k)
					{
						sum+=al.get(0);
						al.remove(0);
					}	
				if(al.size()<=1)
					break;
			}
			while(al.size()!=0)
			{
				sum+=al.remove(0);
			}
			System.out.println(sum);
		}
	}	
} 