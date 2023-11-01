import java.util.Scanner;
public class Account {
	private int accNo;
	private String Name;
	private double accBal;
	public Account(int accNo, String name, double accBal) {
		super();
		this.accNo = accNo;
		Name = name;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	

}
