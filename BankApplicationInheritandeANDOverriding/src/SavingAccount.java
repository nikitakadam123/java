public class SavingAccount extends Account{
	private float intrest;

	public SavingAccount(int accNo, String custName, double accBal, float interestRate) {
		super(accNo, custName, accBal);
		this.intrest = intrest;
	}

	public float getIntrest() {
		return intrest;
	}

	public void setIntrest(float intrest) {
		this.intrest = intrest;
	}

	
}
