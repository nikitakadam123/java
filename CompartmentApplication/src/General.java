
public class General extends Compartment{
	private String coachNo;
	private int ticketNo;
	private int seatNo;
	public General(String coachNo, int ticketNo, int seatNo) {
		super();
		this.coachNo = coachNo;
		this.ticketNo = ticketNo;
		this.seatNo = seatNo;
	}
	
	public void notice() {
		System.out.println("It is General Class available for all people");
		
	}
	
	
}