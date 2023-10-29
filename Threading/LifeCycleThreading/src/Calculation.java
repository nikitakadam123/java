
public class Calculation extends Thread{
	private int n1;
	private int n2;
	 
	
	public Calculation(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run()
	{
		CaculationLogic cl=new CaculationLogic(60,20);
		cl.addData();
		cl.subData();
		cl.mulData();
		cl.divData();
	}
	
}
