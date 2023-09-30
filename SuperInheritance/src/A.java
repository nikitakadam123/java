
public class A {
	protected int x=10;
	private int no;
	private String Name;
	
	A()
	{
		System.out.println("Constructor A is calling...");
	}
    A(int n)
	{
		System.out.println("Paramiterized Constructor...");
	}
	public void dispaly()
	{
		System.out.println("Base class: "+x);
		
	}
	

}
