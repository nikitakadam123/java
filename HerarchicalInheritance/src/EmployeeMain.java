
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee arr[]=create();
		display(arr);
		/*Manager m1=new Manager(101, "Nikita", 80000, 1000);
		
		System.out.println("Employee id is: "+m1.getEmpId());
		System.out.println("Employee Name is: "+m1.getEmpName());
		System.out.println("Employee Salary is: "+m1.getEmpSalary());
		System.out.println("Employee Bonus is: "+m1.getBonus());
		System.out.println("------------------------------------------------");
		
		Devloper d1=new Devloper(102, "Amruta", 100000, 5);
		
		System.out.println("Employe Id is: "+d1.getEmpId());
		System.out.println("Employee Name is: "+d1.getEmpName());
		System.out.println("Employee Salary is: "+d1.getEmpSalary());
		System.out.println("Employee WOrking hour: "+d1.getNoOfHours());*/
	}

	public static Employee[] create()
	{
		Employee arr[]=new Employee[4];
		
		arr[0]=new Manager(101,"Genesh",10000,2000);
		arr[1]=new Devloper(102,"Mahesh",80000,1000);
		arr[2]=new Devloper(103,"Nikita",90000,300);
		arr[3]=new Manager(104,"Amruta",1000000,200);

		return arr;
	}
	public static void display(Employee arr[])
	{
		for(Employee e:arr) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSalary());
			if(e instanceof Manager)
			{
				Manager m=(Manager)e;
				System.out.println(m.getBonus());
				
			}
			if(e instanceof Devloper) {
				Devloper d=(Devloper)e;
				System.out.println(d.getNoOfHours());
			}

		}
	}
}
