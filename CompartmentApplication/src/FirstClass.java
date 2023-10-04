public class FirstClass extends Compartment{
	private int bookingNo;
	private String coachNo;
	private int seatNo;
	
	
	
	public FirstClass(int bookingNo, String coachNo, int seatNo) {
		super();
		this.bookingNo = bookingNo;
		this.coachNo = coachNo;
		this.seatNo = seatNo;
	}



	public void notice() {
		System.out.println("It is First Class with AC Compartment");
	}
	

}