
public class Thread1 extends Thread{
	Msg m;
	String name;
	public Thread1(Msg m, String name) {
		super();
		this.m = m;
		this.name = name;
	}
	public void run()
	{
		
		m.show(name);
	}

}
