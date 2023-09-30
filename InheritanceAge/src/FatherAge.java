
public class FatherAge extends GrandFaterAge {
	private int fage;
	
	public FatherAge(int fage){
		super(fage+30);
	  this.fage=fage;
	 
		
	}
	
	public void showAge()
	{
		super.showAge();
		System.out.println("Father Age is: "+fage);
	}

}
