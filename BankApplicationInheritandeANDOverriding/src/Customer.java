
public class Customer {

	private int custId;
	private String custName;
	private String mobNo;
	private Account acc;
	public Customer(int custId, String custName, String mobNo, Account acc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.acc = acc;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
}
