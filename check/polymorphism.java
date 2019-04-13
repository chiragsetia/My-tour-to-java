public class polymorphism{
public static void main(String[] args) {
	base obj=new drived();
	obj.vir();	
 }
}
class base{
	public void vir(){
	System.out.println("base");		
	}  
}
class drived extends base{
	final public void vir(){
		System.out.println("drived");
	}
}