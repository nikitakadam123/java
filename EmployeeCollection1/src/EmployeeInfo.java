import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class EmployeeInfo {
	public List<Employee> create()
	{
		Scanner sc=new Scanner(System.in);
		List<Employee>lst=new LinkedList<Employee>();
		do {
			System.out.println("Enter Employee Id,Name, Salary");
			int empId=sc.nextInt();
			String empName=sc.next();
			double empSalary=sc.nextDouble();
			
			Employee empobj=new Employee(empId, empName, empSalary);
			lst.add(empobj);
			System.out.println("Do You want to continue? yes/no");
			}while(sc.next().equals("yes"));
			System.out.println("--------------------------------------------");
			return lst;
		}
	public void display(List<Employee> emplst)
	{
		for(Employee e:emplst) {
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
			
		}
	}
}


