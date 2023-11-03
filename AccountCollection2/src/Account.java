

public class Account {
	private int accNo;
	private String custName;
	private long accBal;
	
	public Account(int accNo, String custName, long accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getAccBal() {
		return accBal;
	}
	public void setAccBal(long accBal) {
		this.accBal = accBal;
	}
	
	

}
