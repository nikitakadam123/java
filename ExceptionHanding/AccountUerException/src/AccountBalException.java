
public class AccountBalException extends Exception{

	private double accBal;

	public AccountBalException(double accBal) {
		super();
		this.accBal = accBal;
	}
	public String toString() {
		return "Invalid Balance : your Bal "+ accBal +"is <1000 Exception";
	}
}
