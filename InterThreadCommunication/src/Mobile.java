
public class Mobile {
	boolean b=false;
	public synchronized void call(String str)
	{
		if(b==true)
		{
			try {
				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(str+" calling....\n");
		b=true;
		notifyAll();
	}
	public synchronized void payBill(String str)
	{
		if(b==false)
		{
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n Pay bill here...."+str);
		System.out.println("\n Thank u....");
		System.out.println("---------------------------------");
		b=false;
		notifyAll();
	}

}
