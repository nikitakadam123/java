
public class Account {

	private int accNo;
	private String custName;
	private double accBal;
	private int age;
	public Account(int accNo, String custName, double accBal, int age) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
		this.age = age;
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
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
