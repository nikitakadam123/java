
public class Ladies extends Compartment{
	
	private String coachNo;
	private int seatNo;
	public Ladies(String coachNo, int seatNo) {
		super();
		this.coachNo = coachNo;
		this.seatNo = seatNo;
	}
	
	public void notice() {
		System.out.println("It is Ladies Compartment reserved only for Ladies");
		
	}
	
	

}