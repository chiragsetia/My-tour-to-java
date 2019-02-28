class icpc
{
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int t=abc.nextInt();
		for(int i=0;i<t;i++)
		{
			String a=abc.next();
			int arr[]=new arr[a.length()];
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)=='.')
					arr[j]=11;
				else
					arr[j]=(int)a.charAt(j)-(int)'0';
			}
		}
	}
}