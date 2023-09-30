import java.util.Scanner;
public class Info {

	Scanner sc=new Scanner(System.in);
	public Employee[] create()
	{
		Employee arr[]=null;
		System.out.println("Enter Employee Info: ");
		int n=sc.nextInt();
		arr=new Employee[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Id ");
			System.out.println("Enter Employee Name: ");
			System.out.println("Enter Basic Employee Salary: ");
			System.out.println("Enter Total Salary: ");
			System.out.println("Enter Hra : ");
			System.out.println("Enter da: ");

			arr[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		return arr;
	}
	
	public void Calcutate(Employee arr[])
	{
		double total,hra,da,tax,home;
		for(int i=0;i<arr.length;i++)
		{
			hra=arr[i].getBasicSal()*0.02;
			da=arr[i].getBasicSal()*0.45;
			total=arr[i].getBasicSal()+hra+da;
			tax=arr[i].getBasicSal()*0.07;
			home=total-tax;
			arr[i].setHra(hra);
			arr[i].setDa(da);
			arr[i].setTotalSal(total);
			
			
		}
	}
	
	public void display(Employee emparr[])
	{
		for(int i=0;i<emparr.length;i++)
		{
			System.out.println("______________________________");
            System.out.println("Employee Id: "+emparr[i].getEmpId());
            System.out.println("Employee Name: "+emparr[i].getEmpName());
            System.out.println("Emplyee basic Salary: "+emparr[i].getBasicSal());
            System.out.println("Employee da: "+emparr[i].getDa());
            System.out.println("Employee Hra is: "+emparr[i].getHra());
            System.out.println("Employee total Salary: "+emparr[i].getTotalSal());
		}
	}
}
