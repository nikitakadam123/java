
public class Devloper extends Employee {
	private int NoOfHours;

	public Devloper(int empId, String empName, double empSalary, int noOfHours) {
		super(empId, empName, empSalary);
		NoOfHours = noOfHours;
	}

	public int getNoOfHours() {
		return NoOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		NoOfHours = noOfHours;
	}
	

}
