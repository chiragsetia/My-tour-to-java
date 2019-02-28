import java.util.*;
import java.lang.*;
public class extra<T>
{
	public int  [] afc()
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
	public void pail(T a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public  Integer[] tI(int[] intArray) {

		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}
}
