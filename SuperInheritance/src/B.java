
public class B extends A {
	protected int x=200;
    private int age;
    private int mobileNo;
    public B()
    {
    	super(10);
    	System.out.println("Call the constructor...");
    }
    public void show()
    {
    	dispaly();
    	System.out.println("Value of x is "+x);
    	System.out.println("Value of x is form base class is "+super.x);
    }
}
