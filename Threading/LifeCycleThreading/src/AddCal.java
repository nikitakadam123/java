
public class AddCal extends Thread{
	private int n1;
	private int n2;
	 
	
	public AddCal(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run()
	{
		addData();
	}
	public void addData()
	{
		int add=n1+n2;
		System.out.println("Addition is: "+add);
	}

}
