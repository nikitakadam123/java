class A{
	protected int x=10;
	public A()
	{
		System.out.println("Default Counstructer A");
	}
	public A(int n)
	{
		System.out.println("Parametric Constructer A");
	}
	public void show()
	{
		System.out.println("Display Method From base class A");
	}
}
class B extends A{
	private int x=20;
	public B()
	{
		super(100);
		System.out.println("Defalut Constructor B");
	}
	public void show()
	{
		super.show();
		System.out.println("value of base class A: "+super.x);
		System.out.println("Value of base class B: "+x);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		System.out.println("In main....");
		B b1=new B();
		b1.show();
	
		System.out.println("Thank u!!!");

	}

}
