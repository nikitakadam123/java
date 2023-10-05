import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int n2=sc.nextInt();
		try {
		    float div=n1/n2;
			System.out.println("Result is: "+div);
		}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception "+ex);
		}
		System.out.println("Thank you!!");
	}

}
