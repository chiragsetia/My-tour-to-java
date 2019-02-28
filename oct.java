import java.util.*;
class oct
{
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int t=abc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=abc.nextInt();
			if(n==0)
			{
				System.out.println("1 0 0");
				continue;
			}
			if(n%26==0)
			{
				int ans=1;
				for(int j=1;j<n/26;j++)
				{
					ans*=2;
				}
				System.out.println("0 0 "+ans);
				continue;
			}
			int d=n/26;
			int ans=1;
			for(int j=0;j<d;j++)
			{
				ans*=2;
			}
			int r=n%26;
			if(r>0&&r<3)
			{
				System.out.println(ans+" 0 0");
			}
			else if(r>2&&r<11)
				System.out.println("0 "+ans+" 0");
			else
				System.out.println("0 0 "+ans);
		}
	}
}