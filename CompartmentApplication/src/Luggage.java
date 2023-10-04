public class Luggage extends Compartment{
	private String coachNo;
	private double lWeight;
	private String lOwner;
	
	
	public Luggage(String coachNo, double lWeight, String lOwner) {
		super();
		this.coachNo = coachNo;
		this.lWeight = lWeight;
		this.lOwner = lOwner;
	}



	public void notice() {
		System.out.println("It is Luggage Compartment only for luggage transport not for people travelling.");
		
	}
	
	

}