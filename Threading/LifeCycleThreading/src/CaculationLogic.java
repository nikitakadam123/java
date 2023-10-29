
public class CaculationLogic extends Thread {
	private int n1;
	private int n2;
	
	public CaculationLogic(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void addData()
	{
		int add=n1+n2;
		System.out.println("Addition is: "+add);
	}
	public void subData()
	{
		int sub=n1-n2;
		System.out.println("Substraction is: "+sub);
	}
	public void mulData()
	{
		int mul=n1*n2;
		System.out.println("Multiplcation is: "+mul);
	}
	public void divData()
	{
		int div=n1/n2;
		System.out.println("Division is: "+div);
	}

}
