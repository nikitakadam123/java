
public class CalculationThread implements Runnable {
	Caclulation calc;
	public CalculationThread(Caclulation calc)
	{
		this.calc=calc;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		calc.addData();
		calc.subData();
		calc.mulData();
		calc.divData();
	}

}
