
public class Thread1 extends Thread{
	Table t; 
	int n;//refrance

	public Thread1(Table t,int n) {
		super();
		this.t = t; 
		this.n=n;//Create constuctor
	}
	
	public  void run()
	{
				synchronized (t) {
					t.printTable(n);
				}
			
		
	}

}
