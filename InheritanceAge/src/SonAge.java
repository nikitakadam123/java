
public class SonAge extends FatherAge {
	private int sage;

	public SonAge(int sage) {
		super(sage+30);
		this.sage = sage;
	}

	public void showAge()
	{
	    super.showAge();	
		System.out.println("Son age is: "+sage);
	}

}
