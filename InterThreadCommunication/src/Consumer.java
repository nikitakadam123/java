
public class Consumer implements Runnable{
	private String str;
	private Mobile mob;
	public Consumer(String str, Mobile mob) {
		super();
		this.str = str;
		this.mob = mob;
		new Thread(this).start();
	}
	public void run()
	{
		while(true)
			mob.payBill(str);
	}
	
	

}
