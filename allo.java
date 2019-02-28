import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class allo
{
    private static void checkdublicate(Scanner scanner)
	{
		HashSet<Integer> h=new HashSet<>();
			int n=scanner.nextInt();
			for(int j=0;j<n;j++)
			{
				int element=scanner.nextInt();
				if(h.contains(element))
				{
					System.out.println("yes");
					return;
				}
				h.add(element);
			}
			System.out.println("no");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0;i<t;i++)
			checkdublicate(scanner);
	}
}