import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeInfo empInfo=new EmployeeInfo();
		List<Employee> emplst=empInfo.create();
		empInfo.display(emplst);
	}
}
