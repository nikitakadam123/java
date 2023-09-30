
public class Employee {
	private int empId;
	private String empName;
	private double basicSal;
	private double totalSal;
	private double hra;
	private double da;
	public Employee(int empId, String empName, double basicSal, double totalSal, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.totalSal = totalSal;
		this.hra = hra;
		this.da = da;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(double totalSal) {
		this.totalSal = totalSal;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}

	
	

}
