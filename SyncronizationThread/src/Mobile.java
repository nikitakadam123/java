
public class Mobile {

	public synchronized void call(String str)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(str+ "calling...");
		}
	}
}
