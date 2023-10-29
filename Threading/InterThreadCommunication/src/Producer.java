
public class Producer implements Runnable {
	private String str;
	private Mobile mob;
	public Producer(String str, Mobile mob) {
		super();
		this.str = str;
		this.mob = mob;
		new Thread(this).start();
		
	}
	public void run()
	{
		while(true)
			mob.call(str);
	}
	
	

}
