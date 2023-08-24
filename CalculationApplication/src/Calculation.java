import java.util.Scanner;
public class Calculation {
	Scanner sc= new Scanner(System.in);
	public void add() 
	{
		System.out.println("*************************Enter Numbers for Addition********************************");
		System.out.println("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("Addtion of two number is: "+add);
		//System.out.println("***********************************************************************************");
	}
	
	public void sub()
	{
		System.out.println("***********************Enter Numbers for Substraction******************************");
		System.out.println("Enter 1st number: ");
		int n3=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n4=sc.nextInt();
		int sub=n3-n4;
		System.out.println("Substraction of two number is: "+sub);
		//System.out.println("***********************************************************************************");
	}
	
	public void mul() 
	{
		System.out.println("***********************Enter Numbers for Multiplication****************************");
		System.out.println("Enter 1st number: ");
		int n5=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n6=sc.nextInt();
		int mul=n5*n6;
		System.out.println("Multiplication of two number is: "+mul);
		//System.out.println("***********************************************************************************");
	}
	
	public void div() 
	{
		System.out.println("*************************Enter Numbers for Division*********************************");
		System.out.println("Enter 1st number: ");
		int n7=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n8=sc.nextInt();
		int div=n7/n8;
		System.out.println("Division of two number is: "+div);
		System.out.println("***********************************************************************************");
	}

}
