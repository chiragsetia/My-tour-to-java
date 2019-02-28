import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner abc=new Scanner(System.in);
        int n=abc.nextInt();
        int k=abc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=abc.nextInt();
        }
        int max=0;
        for (int i=0;i<n;i++)
        {
        	int c=0;
        	for(int j=0;j<n;j++)
        	{
        		if(i!=j&&Math.abs(a[i]-a[j])<=k)
        		{
        			System.out.println(a[j]);
        			c++;
        		}
        	}
        	if(c>max)
        		max=c;
        }
        System.out.println(max);
    }
}