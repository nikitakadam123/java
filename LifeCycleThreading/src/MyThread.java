
public class MyThread extends Thread{
	String str;
	public MyThread(String str)
	{
		this.str=str;
	}
	public void run()
	{
		display();
	}
	public void display()
	{
		System.out.println("Hello....Welcome to thread");
	}
    public void mymethod()
    {
    	System.out.println("Thank youuu");
    }
}
