
public class DemoThread extends Thread{
	
	private String str;

	public DemoThread(String str) {
		super();
		this.str = str;
	}
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i+ "\t"+str);
			/*try{
			 Thread.sleep(1000);
			 }
			 catch (InterruptedException e)
			 {
			 e.printStackTrace();
			 }*/
			
		}
	}

}
