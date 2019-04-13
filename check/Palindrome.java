class Palindrome{
	// public static void main(String[] args) {
	// 	int a=Long.toBinaryString(126).length();
	// 	System.out.println(a);
	//}
	public static void main(String[] args) {
		me a=new me(10);
		a.abc(20);
		me b=new me(40);
		me.me1 obj =new me.me1(); 
		System.out.println(me.me1.fun());// example of system.out.println()
	}

}
class me{
	static class me1{
		static public int fun(){
			return 25;
		} 
	}
	static int b;
	{
		System.out.println("1234");
	}
	static {

		System.out.println("123");
	}

	me(int a){
		b=a;
		System.out.println(this.b);
	}
	void abc(int a){
		b=a;	
	}
}