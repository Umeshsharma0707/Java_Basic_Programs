package methods;
class A{
	A(){
		System.out.println("this is constructor");
	}
	public String name() {
		return "Umesh";
	}
	//@Override

	public void math() {
		
		System.out.println("method  of class A");
	}
	public void math(int a) {
		
		
		System.out.println(a);

	}
}
class B extends A{

	public void math() {
		super.math();
		System.out.println("method 1 of class B");
	}
}
public class Method_overriding {
				public static void main(String[] args) {
					// Overriding different class same method without parameter or with parameter
					B obj = new B(); 
					obj.math();
					
				}
}
