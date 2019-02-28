class test
{

	test(int a)
	{
		System.out.println("1");
	}
	void print()
	{
		System.out.println("3");
	}
}
class test_2 extends test
{
	test_2()
	{
		//super.print();
		System.out.println("2");
		
	}
	
}
class test_3
{
	public static void main(String[] args) {
		test_2 abc=new test_2();
		//abc.print();
	}
}