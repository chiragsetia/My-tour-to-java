class help{
help()
{
	System.out.println("1");
}
help(int a)
{
	System.out.println("2");
}

}
public class helpMe extends help
{
	helpMe()
	{
		
		System.out.println("3");
	}
	helpMe(int a)
	{
		super();
		System.out.println("4");
	}
}