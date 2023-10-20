
public class MobileThrad extends Thread{
	private Mobile mobj;
	private String str;
	public MobileThrad(Mobile mobj, String str) {
		super();
		this.mobj = mobj;
		this.str = str;
	}
	public void run()
	{
		mobj.call(str);
	}

}
